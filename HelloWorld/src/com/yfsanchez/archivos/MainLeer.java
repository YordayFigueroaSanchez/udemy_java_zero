package com.yfsanchez.archivos;

import com.yfsanchez.archivos.servicio.ArchivoServicio;

public class MainLeer {
    public static void main(String[] args) {
        String dir = "C:\\utiles\\test.txt";
        ArchivoServicio servicio = new ArchivoServicio();
//        System.out.println(servicio.leerArchivo(dir));
        System.out.println(servicio.leerArchivoScanner(dir));

    }
}
