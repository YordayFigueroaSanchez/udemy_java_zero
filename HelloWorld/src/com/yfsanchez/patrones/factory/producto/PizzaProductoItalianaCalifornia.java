package com.yfsanchez.patrones.factory.producto;

import com.yfsanchez.patrones.factory.PizzaProducto;

public class PizzaProductoItalianaCalifornia extends PizzaProducto {
    public PizzaProductoItalianaCalifornia() {
        super();
        nombre = "Italiana cal";
        masa ="Masa I cal";
        salsa = "Salsa I cal";
        ingredientes.add("Italiana cal 1");
        ingredientes.add("Italiana cal 2");
        ingredientes.add("Italiana cal 3");
        ingredientes.add("Italiana cal 4");
        ingredientes.add("Italiana cal 5");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando Italiana cal");
    }

    @Override
    public void cortar() {
        System.out.println("cortando Italiana cal");
    }
}
