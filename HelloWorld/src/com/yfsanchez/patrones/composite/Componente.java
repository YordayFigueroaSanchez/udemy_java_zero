package com.yfsanchez.patrones.composite;

import java.util.Objects;

abstract public class Componente {
    protected String name;

    public Componente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract String mostrar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Componente that = (Componente) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
