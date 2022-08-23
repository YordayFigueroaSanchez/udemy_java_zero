package com.yfsanchez.patrones.decoratorcafe.decorador;

import com.yfsanchez.patrones.decoratorcafe.Configurable;

abstract public class DecoradorAbstract implements Configurable {

    protected Configurable cafe;

    public DecoradorAbstract(Configurable cafe) {
        this.cafe = cafe;
    }
}
