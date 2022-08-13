package com.yfsanchez.referencia;

public class PasarPorValor {

    public static void main(String[] args) {
        int i = 10;
        System.out.println("i = " + i);
        test(i);
        System.out.println("i = " + i);
    }
    
    public static void test(int i){
        System.out.println("i = " + i);
        i = 40;
        System.out.println("i = " + i);
    }
}
