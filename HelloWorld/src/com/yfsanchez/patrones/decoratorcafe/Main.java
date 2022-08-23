package com.yfsanchez.patrones.decoratorcafe;

import com.yfsanchez.patrones.decoratorcafe.decorador.DecoradorAbstractAzucar;
import com.yfsanchez.patrones.decoratorcafe.decorador.DecoradorAbstractChocolate;
import com.yfsanchez.patrones.decoratorcafe.decorador.DecoradorAbstractMenta;
import com.yfsanchez.patrones.decoratorcafe.decorador.DecoradorAbstractMoca;

public class Main {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(3,"simple");
        DecoradorAbstractChocolate choco = new DecoradorAbstractChocolate(cafe);
        DecoradorAbstractMenta menta = new DecoradorAbstractMenta(choco);
        DecoradorAbstractMoca moca = new DecoradorAbstractMoca(menta);
        DecoradorAbstractAzucar azucar = new DecoradorAbstractAzucar(moca);
        System.out.println("azucar.getPrecio() = " + azucar.getPrecio());
        System.out.println("azucar.getIngredientes() = " + azucar.getIngredientes());
    }
}
