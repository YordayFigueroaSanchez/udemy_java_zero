package com.yfsanchez.anotaciones.procesador;

import com.yfsanchez.anotaciones.JsonAtributo;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class JsonSerializador {
    public static String toJson(Object object){

        if (Objects.isNull(object)){
            throw new RuntimeException("El objeto no puede ser null");
        }

        Field[] atributos = object.getClass().getDeclaredFields();
        return Arrays.stream(atributos).filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        return "\""+nombre + "\":\"" +  f.get(object)+"\"";
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("ERROR AL SERIALIZAR A JSON " + e.getMessage());
                    }
                })
                .reduce("{", (a,b) -> {
                    if ("{".equals(a)){
                        return a+b;
                    }
                    return a + "," + b;
                }).concat("}");
    }
}
