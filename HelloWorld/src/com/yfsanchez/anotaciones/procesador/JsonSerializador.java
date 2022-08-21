package com.yfsanchez.anotaciones.procesador;

import com.yfsanchez.anotaciones.Init;
import com.yfsanchez.anotaciones.JsonAtributo;
import com.yfsanchez.anotaciones.procesador.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializador {
    public static String toJson(Object object){

        if (Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto no puede ser null");
        }

        inicializarObjeto(object);

        Field[] atributos = object.getClass().getDeclaredFields();
        return Arrays.stream(atributos).filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = f.get(object);
                        if (f.getAnnotation(JsonAtributo.class).capitalizar() &&
                        valor instanceof String){
                            String nuevoValor = (String) valor;
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                                    .map(palabra -> palabra.substring(0,1).toUpperCase() +
                                            palabra.substring(1).toLowerCase())
                                            .collect(Collectors.joining( " "));
                            f.set(object,nuevoValor);
                        }
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

    public static void inicializarObjeto(Object object) {

        if (Objects.isNull(object)) {
            throw new JsonSerializadorException("El objeto no puede ser null");
        }

        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(metodo -> metodo.isAnnotationPresent(Init.class))
                .forEach(metodo-> {
                    metodo.setAccessible(true);
                    try {
                        metodo.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException("problemas al serializar elemento");
                    }
                });

    }
}
