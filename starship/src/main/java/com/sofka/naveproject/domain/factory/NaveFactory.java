package com.sofka.naveproject.domain.factory;

import com.sofka.naveproject.domain.model.Lanzadera;
import com.sofka.naveproject.domain.model.NoTripulada;
import com.sofka.naveproject.domain.model.Tripulada;

import java.util.Date;

public class NaveFactory {

    public NaveFactory(){}

    public static  Lanzadera construirLanzadera(String nombre, Date fechaLanzamiento, String nacionalidad, Double velocidad, Double empuje, Double peso, String combustible, Double altura, Double capacidadCarga){
        return new Lanzadera(nombre,fechaLanzamiento,nacionalidad,velocidad, empuje,peso, combustible, altura, capacidadCarga);
    }

    public static  Tripulada construirTripulada( String nombre, Date fechaLanzamiento, String nacionalidad, Double velocidad, Double empuje, Double peso, String combustible, Double altura, Double potencia, int pasajeros){
        return new Tripulada( nombre,fechaLanzamiento,nacionalidad,velocidad, empuje,peso,combustible,altura,potencia,pasajeros);
    }

    public static  NoTripulada construirNoTripulada( String nombre, Date fechaLanzamiento, String nacionalidad, Double velocidad, Double empuje, Double peso, String combustible, Double altura, Double potencia){
        return new NoTripulada(nombre,fechaLanzamiento,nacionalidad,velocidad,empuje,peso,combustible,altura,potencia);
    }
}
