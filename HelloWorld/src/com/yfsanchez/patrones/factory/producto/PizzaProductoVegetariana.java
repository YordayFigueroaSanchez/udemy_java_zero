package com.yfsanchez.patrones.factory.producto;

import com.yfsanchez.patrones.factory.PizzaProducto;

public class PizzaProductoVegetariana extends PizzaProducto {
    public PizzaProductoVegetariana() {
        super();
        nombre = "Vegetariana";
        masa ="Masa V";
        salsa = "Salsa V";
        ingredientes.add("Veg 1");
        ingredientes.add("Veg 2");
        ingredientes.add("Veg 3");
        ingredientes.add("Veg 4");
        ingredientes.add("Veg 5");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando vegetariana");
    }

    @Override
    public void cortar() {
        System.out.println("cortando vegetariana");
    }
}
