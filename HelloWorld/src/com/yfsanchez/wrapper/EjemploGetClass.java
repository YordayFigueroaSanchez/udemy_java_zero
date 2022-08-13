package com.yfsanchez.wrapper;

import java.lang.reflect.Method;

public class EjemploGetClass {
    public static void main(String[] args) {
        String str = "fdhgfhd";
        
        Class c = str.getClass();

        System.out.println("c.getName() = " + c.getName());

        for (Method method: c.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }
    }
}
