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
        Componente gpuRam1 = new Componente("GPU ram1");
        Componente gpuRam2 = new Componente("GPU ram2");
        Componente gpuVentiladores = new Componente("GPU ventiladores");
        Componente ram = new Componente("RAM");
        Componente ssd = new Componente("SSD");

        cpu.addComponente(ventilador).addComponente(disipador);
        tv.addComponente(gpu).addComponente(gpuRam1).addComponente(gpuRam2).addComponente(gpuVentiladores);
        placaMadre.addComponente(cpu).addComponente(tv).addComponente(ram).addComponente(ssd);
        pc.addComponente(poder).addComponente(placaMadre).addComponente(new Componente("Teclado")).addComponente(new Componente("Mouse"));

        metodoRecursivo(pc, 0);
    }

    public static void metodoRecursivo(Componente c, int nivel){

        System.out.println(repetirN("\t",nivel) + c.getNombre());
        if (c.tieneHijos()){
            for (Componente hijo: c.getHijos()){
                metodoRecursivo(hijo, nivel+1);
            }
        }
    }

    private static String repetirN(String cadena, int cantidad){
        String resultado = "";
        for (int i = 0; i < cantidad; i++) {
            resultado = resultado.concat(cadena);
        }
        return resultado;
    }
}
