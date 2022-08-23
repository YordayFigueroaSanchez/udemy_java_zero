package com.yfsanchez.patrones.decorator.decoradores;

import com.yfsanchez.patrones.decorator.Formateable;

public class DecoradorAbstractMayuscula extends DecoradorAbstract{
    public DecoradorAbstractMayuscula(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
