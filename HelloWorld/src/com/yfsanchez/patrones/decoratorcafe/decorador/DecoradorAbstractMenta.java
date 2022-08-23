package com.yfsanchez.patrones.decoratorcafe.decorador;

import com.yfsanchez.patrones.decoratorcafe.Configurable;

public class DecoradorAbstractMenta extends DecoradorAbstract{

    public DecoradorAbstractMenta(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio() + 3f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Menta";
    }
}
