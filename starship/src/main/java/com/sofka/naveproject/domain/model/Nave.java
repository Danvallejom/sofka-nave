package com.sofka.naveproject.domain.model;

import java.util.Date;

public  abstract class Nave {


    private String nombre;
    private Date fechaLanzamiento;
    private String nacionalidad;
    private Double velocidad;
    private Double empuje;
    private Double peso;
    private String combustible;
    private Double altura;


    public Nave(String nombre, Date fechaLanzamiento, String nacionalidad, Double velocidad, Double empuje, Double peso, String combustible, Double altura) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.nacionalidad = nacionalidad;
        this.velocidad = velocidad;
        this.empuje= empuje;
        this.peso = peso;
        this.combustible = combustible;
        this.altura = altura;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double getEmpuje() {
        return empuje;
    }

    public void setEmpuje(Double empuje) {
        this.empuje = empuje;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public abstract String despegar();
    public abstract String volar();
    public abstract String desacoplar();
    
    public Nave(){}

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", \nFecha inicial de lanzamiento: " + fechaLanzamiento +
                ", \nNacionalidad: " + nacionalidad + ", \nVelocidad: " + velocidad + " km/s" +  ", \nEmpuje: " + empuje
                + " ton" +  ", \nPeso: " + peso + " ton" +  ", \nCombustible: " + combustible
                + ", \nAltura: " + altura + " metros"  + ", \n" +  this.despegar()  + ", \n" + this.volar() + ", \n" + this.desacoplar();
    }
    

    
}

