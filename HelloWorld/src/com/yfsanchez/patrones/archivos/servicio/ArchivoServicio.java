package com.yfsanchez.patrones.archivos.servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
