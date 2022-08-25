package com.yfsanchez.patrones.archivos.servicio;

import java.io.*;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.append("test 1\n")
                    .append("test 2\n")
                    .append("test 3\n");
            buffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivoPrint(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true);
            PrintWriter printWriter = new PrintWriter(escritor);
            printWriter.printf("Hola %s", "Test");
            printWriter.println();
            printWriter.println("test 1");
            printWriter.println("test 2");
            printWriter.println("test 3");
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
