package com.yfsanchez.patrones.decoratorcafe.decorador;

import com.yfsanchez.patrones.decoratorcafe.Configurable;

public class DecoradorAbstractMoca extends DecoradorAbstract{

    public DecoradorAbstractMoca(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecio() {
        return cafe.getPrecio() + 4f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Moca";
    }
}
