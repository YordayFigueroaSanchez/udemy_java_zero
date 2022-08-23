package com.yfsanchez.patrones.factory.producto;

import com.yfsanchez.patrones.factory.PizzaProducto;

public class PizzaProductoItaliana extends PizzaProducto {
    public PizzaProductoItaliana() {
        super();
        nombre = "Italiana";
        masa ="Masa I";
        salsa = "Salsa I";
        ingredientes.add("Italiana 1");
        ingredientes.add("Italiana 2");
        ingredientes.add("Italiana 3");
        ingredientes.add("Italiana 4");
        ingredientes.add("Italiana 5");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando Italiana");
    }

    @Override
    public void cortar() {
        System.out.println("cortando Italiana");
    }
}
