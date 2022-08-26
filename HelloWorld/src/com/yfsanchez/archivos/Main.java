package com.yfsanchez.archivos;

import com.yfsanchez.archivos.servicio.ArchivoServicio;

public class Main {
    public static void main(String[] args) {
        String dir = "C:\\utiles\\test.txt";
        ArchivoServicio servicio = new ArchivoServicio();
        servicio.crearArchivoPrint(dir);
    }
}
