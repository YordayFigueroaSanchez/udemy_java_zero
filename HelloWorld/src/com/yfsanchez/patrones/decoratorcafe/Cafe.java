package com.yfsanchez.patrones.decoratorcafe;

public class Cafe implements Configurable{
    private float precio;
    private String ingredientes;

    public Cafe(float precio, String ingredientes) {
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public String getIngredientes() {
        return ingredientes;
    }
}
