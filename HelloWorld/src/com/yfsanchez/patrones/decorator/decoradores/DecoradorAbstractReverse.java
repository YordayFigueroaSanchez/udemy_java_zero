package com.yfsanchez.patrones.decorator.decoradores;

import com.yfsanchez.patrones.decorator.Formateable;

public class DecoradorAbstractReverse extends DecoradorAbstract{
    public DecoradorAbstractReverse(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
