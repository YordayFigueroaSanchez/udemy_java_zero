package com.yfsanchez.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{

    private List<Componente> hijos;

    public Directorio(String name) {
        super(name);
        this.hijos = new ArrayList<>();
    }

    public Componente addComponente(Componente componente){
        this.hijos.add(componente);
        return this;
    }

    public void removeComponente(Componente componente){
        this.hijos.remove(componente);
    }

    @Override
    String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append(name)
                .append("/")
                .append("\n");
        for (Componente hijo: this.hijos){
            sb.append(hijo.mostrar());
            if (hijo instanceof Archivo){
                   sb.append("\n");
            }
        }
        return sb.toString();
    }
}
