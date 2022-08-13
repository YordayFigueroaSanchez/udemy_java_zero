package com.yfsanchez.wrapper;

public class WreapperInteger {
    public static void main(String[] args) {
        Integer intObjeto = Integer.valueOf(37845);
        Integer intObjeto2 = 12345;
        System.out.println("intObjeto2 = " + intObjeto2);

        int int1 = intObjeto;
        int int2 = intObjeto2.intValue();
        System.out.println("int2 = " + int2);

        String str = "67098";
        Integer valor = Integer.valueOf(str);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);


    }
}
