package com.yfsanchez.patrones.decorator;

public class Texto implements Formateable{
    private String str;

    public Texto(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String darFormato() {
        return getStr();
    }
}
