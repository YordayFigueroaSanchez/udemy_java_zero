package com.yfsanchez.patrones.factory;

import com.yfsanchez.patrones.factory.producto.PizzaProductoItaliana;
import com.yfsanchez.patrones.factory.producto.PizzaProductoPeperoni;
import com.yfsanchez.patrones.factory.producto.PizzaProductoVegetariana;

public class PizzeriaFactoryAbstractNewYork extends PizzeriaFactoryAbstract{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "italiana":
                producto = new PizzaProductoItaliana();
                break;
            case "vegetariana":
                producto = new PizzaProductoVegetariana();
                break;
            case "peperoni":
                producto = new PizzaProductoPeperoni();
                break;
        }
        return producto;
    }
}
