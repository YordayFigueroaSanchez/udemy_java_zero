package com.yfsanchez.patrones.factory.producto;

import com.yfsanchez.patrones.factory.PizzaProducto;

public class PizzaProductoPeperoni extends PizzaProducto {
    public PizzaProductoPeperoni() {
        super();
        nombre = "Peperoni";
        masa ="Masa Peperoni";
        salsa = "Salsa Peperoni";
        ingredientes.add("Peperoni 1");
        ingredientes.add("Peperoni 2");
        ingredientes.add("Peperoni 3");
        ingredientes.add("Peperoni 4");
        ingredientes.add("Peperoni 5");
    }

    @Override
    public void cocinar() {
        System.out.println("cocinando Peperoni");
    }

    @Override
    public void cortar() {
        System.out.println("cortando Peperoni");
    }
}
