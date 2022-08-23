package com.yfsanchez.patrones.decorator.decoradores;

import com.yfsanchez.patrones.decorator.Formateable;

public class DecoradorAbstractSacarEspacios extends DecoradorAbstract{
    public DecoradorAbstractSacarEspacios(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","");
    }
}
