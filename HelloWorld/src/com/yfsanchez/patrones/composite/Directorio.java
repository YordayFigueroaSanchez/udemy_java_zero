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
    String mostrar(int nivel) {
        StringBuilder sb = new StringBuilder();
        sb.append(agregarNivel(nivel))
                .append(name)
                .append("/")
                .append("\n");
        for (Componente hijo: this.hijos){
            sb.append(hijo.mostrar(nivel+1));
            if (hijo instanceof Archivo){
                   sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    boolean buscar(String name) {
        if (this.name.equalsIgnoreCase(name)){
            return true;
        } else {
            return hijos.stream().anyMatch(componente -> componente.buscar(name));
//            for (Componente hijo: this.hijos){
//                if (hijo.buscar(name)){
//                    return true;
//                }
//            }
//            return false;
        }
    }
}
