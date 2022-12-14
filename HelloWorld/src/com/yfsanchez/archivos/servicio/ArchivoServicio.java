package com.yfsanchez.archivos.servicio;

import java.io.*;
import java.util.Scanner;

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
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(archivo, true))){
            printWriter.printf("Hola %s", "Test");
            printWriter.println();
            printWriter.println("test 1");
            printWriter.println("test 2");
            printWriter.println("test 3");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre){
        File archivo = new File(nombre);
        StringBuilder sb = new StringBuilder();
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            String linea;
            while ((linea = buffer.readLine()) != null){
                sb.append(linea).append("\n");
            }
            lector.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public String leerArchivoScanner(String nombre){
        File archivo = new File(nombre);
        StringBuilder sb = new StringBuilder();
        try {
            Scanner lector = new Scanner(archivo);
            lector.useDelimiter("\n");
            String linea;
            while (lector.hasNext()){
                sb.append(lector.next()).append("\n");
            }
            lector.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
