package com.yfsanchez.patrones.decoratorcafe.decorador;

import com.yfsanchez.patrones.decoratorcafe.Configurable;

public class DecoradorAbstractAzucar extends DecoradorAbstract{

    public DecoradorAbstractAzucar(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio() + 2f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Azucar";
    }
}
