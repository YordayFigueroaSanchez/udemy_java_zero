package com.yfsanchez.referencia;

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona p = new Persona("Jeisell");
        System.out.println("inicia el mail");
        System.out.println("persona = " + p.getNombre());
        test(p);
        System.out.println("persona = " + p.getNombre());

    }

    public static void test(Persona p){
        System.out.println("persona = " + p.getNombre());
        p.setNombre("Yodroy");
        System.out.println("persona = " + p.getNombre());

    }
}
