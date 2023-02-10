package com.sofka.naveproject.domain.model;


import java.util.Date;

public class Lanzadera  extends  Nave{


    private Double capacidadCarga;

    public Lanzadera( String nombre, Date fechaLanzamiento, String nacionalidad, Double velocidad, Double empuje, Double peso, String combustible, Double altura, Double capacidadCarga) {
        super( nombre, fechaLanzamiento,nacionalidad,velocidad,empuje, peso, combustible, altura);
        this.capacidadCarga = capacidadCarga;
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String despegar(){
        return "El despegue ha sido exitoso";
    }
    @Override
    public String volar() {
        return "La nave se encuentra volando a una velocidad estable";
    }

    @Override
    public String desacoplar() {
        return "El desacople ha sido exitoso";
    }

    public static String desplegar() {
        return "El desplieque de la lanzadera ha sido realizado exitosamente";
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "La capacidad de carga de la nave tipo lanzadera es: " + capacidadCarga + "ton";
    }

    
    

}