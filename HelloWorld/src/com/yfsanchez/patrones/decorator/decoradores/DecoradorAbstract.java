package com.yfsanchez.patrones.decorator.decoradores;

import com.yfsanchez.patrones.decorator.Formateable;

abstract public class DecoradorAbstract implements Formateable{
    protected Formateable texto;

    public DecoradorAbstract(Formateable texto) {
        this.texto = texto;
    }

}
