package com.yfsanchez.anotaciones;

import com.yfsanchez.anotaciones.models.Producto;
import com.yfsanchez.anotaciones.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotaciones {
    public static void main(String[] args) {

        Producto product = new Producto();
        product.setPrecio(500L);
        product.setNombre("nombre");
        product.setFecha(LocalDate.now());

        System.out.println("json = " + JsonSerializador.toJson(product));
    }
}
