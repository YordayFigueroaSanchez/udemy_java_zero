package com.yfsanchez.patrones.factory.producto;

import com.yfsanchez.patrones.factory.PizzaProducto;

public class PizzaProductoVegetarianaCalifornia extends PizzaProducto {
    public PizzaProductoVegetarianaCalifornia() {
        super();
        nombre = "Vegetariana cal";
        masa ="Masa V cal";
        salsa = "Salsa V cal";
        ingredientes.add("Veg cal 1");
        ingredientes.add("Veg cal 2");
        ingredientes.add("Veg cal 3");
        ingredientes.add("Veg cal 4");
        ingredientes.add("Veg cal 5");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando vegetariana cal");
    }

    @Override
    public void cortar() {
        System.out.println("cortando vegetariana cal");
    }
}
