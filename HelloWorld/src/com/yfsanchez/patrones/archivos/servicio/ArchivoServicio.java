package com.yfsanchez.patrones.archivos.servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.append("test 1\n")
                    .append("test 2\n")
                    .append("test 3\n");
            escritor.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
