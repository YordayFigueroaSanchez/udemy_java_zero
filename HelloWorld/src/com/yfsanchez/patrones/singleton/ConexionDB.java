package com.yfsanchez.patrones.singleton;

public class ConexionDB {
    private static ConexionDB instancia;

    private  ConexionDB() {
        System.out.println("crear instancia....");
    }

    public static ConexionDB getInstance(){
        if (instancia == null){
            instancia = new ConexionDB();
        }
        return instancia;
    }
}
