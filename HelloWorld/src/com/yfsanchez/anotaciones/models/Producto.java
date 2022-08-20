package com.yfsanchez.anotaciones.models;

import com.yfsanchez.anotaciones.JsonAtributo;

import java.time.LocalDate;

public class Producto {

    @JsonAtributo(nombre = "nameTest", capitalizar = true)
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
}
