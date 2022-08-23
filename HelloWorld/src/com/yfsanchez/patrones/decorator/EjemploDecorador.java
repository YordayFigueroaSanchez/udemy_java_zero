package com.yfsanchez.patrones.decorator;

import com.yfsanchez.patrones.decorator.decoradores.DecoradorAbstractMayuscula;
import com.yfsanchez.patrones.decorator.decoradores.DecoradorAbstractReverse;
import com.yfsanchez.patrones.decorator.decoradores.DecoradorAbstractSacarEspacios;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable cadena = new Texto("Test de decorador para patrones de diseno.");

        DecoradorAbstractMayuscula mayuscula = new DecoradorAbstractMayuscula(cadena);
        System.out.println("mayuscula = " + mayuscula.darFormato());
        DecoradorAbstractReverse reverse = new DecoradorAbstractReverse(mayuscula);
        System.out.println("reverse = " + reverse.darFormato());
        DecoradorAbstractSacarEspacios espacios = new DecoradorAbstractSacarEspacios(reverse);
        System.out.println("espacios.darFormato() = " + espacios.darFormato());
    }
}
