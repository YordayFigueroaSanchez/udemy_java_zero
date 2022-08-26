package com.yfsanchez.patrones.archivos;

import com.yfsanchez.patrones.archivos.servicio.ArchivoServicio;

public class MainLeer {
    public static void main(String[] args) {
        String dir = "C:\\utiles\\test.txt";
        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(servicio.leerArchivo(dir));

    }
}
