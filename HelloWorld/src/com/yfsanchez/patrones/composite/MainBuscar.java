package com.yfsanchez.patrones.composite;

public class MainBuscar {
    public static void main(String[] args) {
        Directorio root = new Directorio("root");
        Directorio java = new Directorio("java");
        java.addComponente(new Archivo("fichero.java"));
        java.addComponente(new Archivo("fichero2.java"));
        
        Directorio src = new Directorio("src");
        src.addComponente(new Archivo("elemento.doc"));
        src.addComponente(new Archivo("elemento2.doc"));
        
        java.addComponente(src);
        
        root.addComponente(java);
        root.addComponente(new Archivo("root2.doc"));

        System.out.println(root.buscar("src2"));
    }
}
