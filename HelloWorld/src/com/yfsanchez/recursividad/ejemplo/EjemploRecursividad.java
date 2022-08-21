package com.yfsanchez.recursividad.ejemplo;

import com.yfsanchez.recursividad.models.Componente;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("PC");
        Componente poder = new Componente("Fuente");
        Componente placaMadre = new Componente("Pplaca Madre");
        Componente cpu = new Componente("CPU");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("disipador");
        Componente tv = new Componente("Nvidia");
        Componente gpu = new Componente("GPU");
        Componente gpuRam1 = new Componente("PC");
        Componente gpuRam2 = new Componente("PC");
        Componente gpuVentiladores = new Componente("PC");
        Componente ram = new Componente("PC");
        Componente ssd = new Componente("PC");

        cpu.addComponente(ventilador).addComponente(disipador);
        tv.addComponente(gpu).addComponente(gpuRam1).addComponente(gpuRam2).addComponente(gpuVentiladores);
        placaMadre.addComponente(cpu).addComponente(tv).addComponente(ram).addComponente(ssd);
        pc.addComponente(poder).addComponente(placaMadre).addComponente(new Componente("Teclado")).addComponente(new Componente("Mouse"));

        metodoRecursivo(pc);
    }

    public static void metodoRecursivo(Componente c){
        System.out.println(c.getNombre());
        if (c.tieneHijos()){
            for (Componente hijo: c.getHijos()){
                metodoRecursivo(hijo);
            }
        }
    }
}
