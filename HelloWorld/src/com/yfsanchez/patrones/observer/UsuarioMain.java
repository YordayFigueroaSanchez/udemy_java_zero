package com.yfsanchez.patrones.observer;

public class UsuarioMain {
    public static void main(String[] args) {
        UsuarioRepositorio usuarios = new UsuarioRepositorio();

        usuarios.addObserver((observable,obj) -> {
            System.out.println("Agregar a grupos " + obj);
        });
        usuarios.addObserver((observable,obj) -> {
            System.out.println("Agregar a test " + obj);
        });
        usuarios.addObserver((observable,obj) -> {
            System.out.println("Asignar espacio " + obj);
        });
        usuarios.crearUsuario("Test");
    }
}
