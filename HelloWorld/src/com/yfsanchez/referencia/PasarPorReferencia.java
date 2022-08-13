package com.yfsanchez.referencia;

public class PasarPorReferencia {
    public static void main(String[] args) {
        int [] edad = {10,20,30};
        System.out.println("inicia el mail");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
        test(edad);
        System.out.println("despues del test.....");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }

    }

    public static void test(int[] edad){
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
        for (int i = 0; i < edad.length; i++) {
            edad[i] = edad[i] + 4;
        }
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
    }
}
