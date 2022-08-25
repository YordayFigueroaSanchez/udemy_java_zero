package com.yfsanchez.patrones.observer;

public class Main {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("google", 100);

        google.addObserver(observable -> {
            System.out.println("Cliente1 " + observable);
        });
        google.addObserver(observable -> {
            System.out.println("Cliente2 " + observable);
        });
        google.addObserver(observable -> {
            System.out.println("Cliente3 " + observable);
        });
        google.cambiaPrecio(101);
    }
}
