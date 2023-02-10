package com.sofka.naveproject.domain.model;


import java.util.Date;

public class Tripulada extends Nave implements NavesExploradoras{

    private Double potencia;
    private int pasajeros;

    public Tripulada(String nombre, Date fechaLanzamiento, String nacionalidad, Double velocidad, Double empuje, Double peso, String combustible, Double altura, Double potencia, int pasajeros) {
        super(nombre, fechaLanzamiento,nacionalidad,velocidad,empuje, peso, combustible, altura);
        this.potencia = potencia;
        this.pasajeros = pasajeros;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String despegar(){
        return "El despegue de la nave tripulada ha sido exitoso, la tripulación se encuntra bien";
    }

    @Override
    public String volar() {

        return "Se reporta que la nave tripulada se encuentra volando a una velocidad estable";
    }

    @Override
    public String desacoplar() {
        return "El desacople de la nave tripulada ha sido exitoso";
    }

    @Override
    public String explorar() {

        return "La nave tripulada se encuentra en la orbita del planeta, preparada para explorar";
    }

    public static String acoplar1() {

        return "El acople de la nave tripulada a la estación internacional de la nave tripulada ha sido exitoso";
    }

    public static String activarRCS1 () {

        return "El sistema de control de reacción de la nave tripulada ha sido activado";
    }

    public static String orbitar1() {

        return "la nave tripulada se ha puesto en orbita a una velocidad estable";
    }

    public static String tomarFotos1 () {

        return "la cámara telescópica de la nave tripulada ha tomado una ráfaga de fotos exitosamente";
    }


    public static String tomarMuestras1 () {

        return "la sonda de la nave tripulada ha sido desplegada para la toma de muestras";
    }


    public static String despresurizar1 () {

        return "la cámara de acople de la nave tripulada ha sido despresurizada";
    }


    public static String activarOMS1 () {

        return "El sistema de maniobra orbital de la nave tripulada ha sido activado exitosamente";
    }


    public static String desplegarParacaidas1 () {

        return "El despliegue del paracaídas de la nave tripulada para el aterrizaje ha sido exitoso";
    }



    public static String planear1 () {

        return "La nave tripulada se prepara para planear siguiendo una trayectoria en círculos, el ángulo de inclinación se encuentra dentro del rango esperado";
    }

    public String enfriarSistema () {

        return "El enfriamento  del sistema de la nave tripulada ha sido activado. La temperatura de la nave se encuentra estable";
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "La potencia de la nave tripulada es"  + " potencia " + potencia + " watts" + "\n La cantidad de pasajeros en la nave tripulada es: " + pasajeros + "\n/Enfriar sistema/ " + this.enfriarSistema() + "\n La nave tripulada está preparada para iniciar la exploración " + this.explorar()  ;
    }
   
    
}