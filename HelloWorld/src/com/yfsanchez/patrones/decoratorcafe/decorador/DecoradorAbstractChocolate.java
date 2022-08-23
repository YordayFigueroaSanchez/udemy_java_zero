package com.yfsanchez.patrones.decoratorcafe.decorador;

import com.yfsanchez.patrones.decoratorcafe.Configurable;

public class DecoradorAbstractChocolate extends DecoradorAbstract{

    public DecoradorAbstractChocolate(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio() + 5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Chocolate";
    }
}
