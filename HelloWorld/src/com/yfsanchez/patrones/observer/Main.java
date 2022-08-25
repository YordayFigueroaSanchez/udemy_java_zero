package com.yfsanchez.patrones.observer;

public class Main {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("google", 100);

        google.addObserver(observable -> {
            System.out.println("Cliente1 " + ((Corporacion)observable).getNombre() +
                    " nuevo precio " +
                    ((Corporacion)observable).getPrecio());
        });
        google.addObserver(observable -> {
            System.out.println("Cliente2 " + ((Corporacion)observable).getNombre() +
                    " nuevo precio " +
                    ((Corporacion)observable).getPrecio());
        });
        google.addObserver(observable -> {
            System.out.println("Cliente3 " + ((Corporacion)observable).getNombre() +
                    " nuevo precio " +
                    ((Corporacion)observable).getPrecio());
        });
        google.cambiaPrecio(101);
    }
}
