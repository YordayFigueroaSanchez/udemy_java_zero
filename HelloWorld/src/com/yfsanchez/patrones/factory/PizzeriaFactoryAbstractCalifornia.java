package com.yfsanchez.patrones.factory;

import com.yfsanchez.patrones.factory.producto.*;

public class PizzeriaFactoryAbstractCalifornia extends PizzeriaFactoryAbstract{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "italiana":
                producto = new PizzaProductoItalianaCalifornia();
                break;
            case "vegetariana":
                producto = new PizzaProductoVegetarianaCalifornia();
                break;
        }
        return producto;
    }
}
