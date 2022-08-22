package com.yfsanchez.patrones.singleton;

public class EjemploSingleton {

    public static void main(String[] args) {

        ConexionDB con01 = null;

        for (int i = 0; i < 8; i++) {
            con01 = ConexionDB.getInstance();
            System.out.println("con01 = " + con01);
        }

        ConexionDB con02 = ConexionDB.getInstance();
        ConexionDB con03 = ConexionDB.getInstance();

        if (con01 == con02 && con01 == con03 && con02 == con03){
            System.out.println("true");
        }
    }
}
