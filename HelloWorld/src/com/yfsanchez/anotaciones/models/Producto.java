package com.yfsanchez.anotaciones.models;

import com.yfsanchez.anotaciones.Init;
import com.yfsanchez.anotaciones.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Producto {

    @JsonAtributo(nombre = "nameTest")
    private String nombre;

    @JsonAtributo(nombre = "amountTest")
    private Long precio;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    private LocalDate fecha;

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Init
    private void inicializar(){
        this.nombre = Arrays.stream(this.nombre.split(" "))
                .map(palabra -> palabra.substring(0,1).toUpperCase() +
                        palabra.substring(1).toLowerCase())
                .collect(Collectors.joining( " "));
    }
}
