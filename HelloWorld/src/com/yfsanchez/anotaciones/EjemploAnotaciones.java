package com.yfsanchez.anotaciones;

import com.yfsanchez.anotaciones.models.Producto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotaciones {
    public static void main(String[] args) {

        Producto product = new Producto();
        product.setPrecio(500L);
        product.setNombre("nombre");
        product.setFecha(LocalDate.now());

        Field[] atributos = product.getClass().getDeclaredFields();

        String json = Arrays.stream(atributos).filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        return "\""+nombre + "\":\"" +  f.get(product)+"\"";
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

        System.out.println("json = " + json);

    }
}
