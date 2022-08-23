package com.yfsanchez.patrones.factory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaFactoryAbstract ny = new PizzeriaFactoryAbstractNewYork();
        PizzeriaFactoryAbstract california = new PizzeriaFactoryAbstractCalifornia();

        PizzaProducto pizza = null;

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("pizza = " + pizza.getNombre());
        pizza = ny.ordenarPizza("italiana");
        System.out.println("pizza = " + pizza.getNombre());
        pizza = california.ordenarPizza("vegetariana");
        System.out.println("pizza = " + pizza.getNombre());
        pizza = california.ordenarPizza("italiana");
        System.out.println("pizza = " + pizza.getNombre());

    }
}
