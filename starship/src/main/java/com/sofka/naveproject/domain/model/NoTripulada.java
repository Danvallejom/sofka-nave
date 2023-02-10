package com.sofka.naveproject.domain.model;

import java.util.Date;
import java.util.Scanner;
import java.util.Scanner;

public class NoTripulada  extends  Nave implements  NavesExploradoras {

    private Double potencia;

    public NoTripulada(String nombre, Date fechaLanzamiento, String nacionalidad, Double velocidad, Double empuje, Double peso, String combustible, Double altura, Double potencia) {
        super( nombre, fechaLanzamiento,nacionalidad,velocidad,empuje, peso, combustible, altura);
        this.potencia = potencia;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String despegar(){
        return "El despegue ha sido exitoso, el sistema automático está funcionando";
    }

    @Override
    public String volar() {

        return "La nave no tripulada se encuentra volando a una velocidad estable";
    }

    @Override
    public String desacoplar() {
        return "El desacople de la nave no tripulada ha sido exitoso";
    }

    @Override
    public String explorar() {
        return "La nave no tripulada se encuentra en la orbita del planeta, preparada para explorar";
    }


    public static String acoplar2() {

        return "El acople de la nave no tripulada a la estación internacional de la nave no tripulada ha sido exitoso";
    }

    public static String activarRCS2 () {

        return "EL sistema de control de reacción de la nave no tripulada ha sido activado";
    }

    public static String orbitar2() {

        return "la nave no tripulada se ha puesto en orbita a una velocidad estable";
    }

    public static String tomarFotos2 () {

        return "la cámara telescópica de la nave no tripulada ha tomado una ráfaga de fotos exitosamente";
    }


    public static String tomarMuestras2 () {

        return "la sonda de la nave no tripulada ha sido desplegada para la toma de muestras";
    }


    public static String despresurizar2 () {

        return "la cámara de acople de la nave no tripulada ha sido despresurizada";
    }


    public static String activarOMS2 () {

        return "El sistema de maniobra orbital de la nave no tripulada ha sido activado exitosamente";
    }


    public static String desplegarParacaidas2 () {

        return "El despliegue del paracaídas de la nave no tripulada para el aterrizaje ha sido exitoso";
    }




    public static String planear2 () {

        return "La nave no tripulada se prepara para planear siguiendo una trayectoria en círculos, el ángulo de inclinación se encuentra dentro del rango esperado";
    }

    public String enfriarSistema () {

        return "El enfriamento del sistema de la nave no tripulada ha sido activado. La temperatura de la nave se encuentra estable";
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return  " La potencia de la nave no tripulada es: " + potencia +" watts" + "\n/Enfriar sistema/ " + this.enfriarSistema() + "\n La nave no tripulada está preparada para iniciar la exploración" + this.explorar() ;
    }
    
   

}


