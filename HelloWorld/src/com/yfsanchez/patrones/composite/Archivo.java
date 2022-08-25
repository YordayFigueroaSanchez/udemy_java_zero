package com.yfsanchez.patrones.composite;

public class Archivo extends Componente{
    public Archivo(String name) {
        super(name);
    }

    @Override
    String mostrar(int nivel) {
        return agregarNivel(nivel)+name;
    }

    @Override
    boolean buscar(String name) {
        return this.name.equalsIgnoreCase(name);
    }
}
