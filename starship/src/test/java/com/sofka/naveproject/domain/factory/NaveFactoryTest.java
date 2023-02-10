package com.sofka.naveproject.domain.factory;

import com.sofka.naveproject.domain.model.Lanzadera;
import com.sofka.naveproject.domain.model.NoTripulada;
import com.sofka.naveproject.domain.model.Tripulada;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sofka.naveproject.domain.factory.NaveFactory.*;
import static org.junit.jupiter.api.Assertions.*;

public class NaveFactoryTest {

    @Test
    public void deberiaCrearUnaNaveLanzadera() throws ParseException {

        //arrange - preparación de los datos

        String nombre="Saturno V";
        String fechaLanzamiento2= "1967/02/10";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaLanzamiento = sdf.parse(fechaLanzamiento2);
        String nacionalidad="Estados Unidos";
        Double velocidad=2.756;
        Double empuje=3500.0;
        Double peso=2900.0;
        String combustible="Queroseno, hidrógeno líquido y Oxígeno líquido";
        Double altura=100.0;
        Double capacidadCarga=140.0;

        //act se ejecuta la funcionalidad que quiero probar
        Lanzadera nave1= new Lanzadera(nombre,fechaLanzamiento,nacionalidad,velocidad,empuje,peso,combustible,altura,capacidadCarga);
        Lanzadera naveL= construirLanzadera(nombre,fechaLanzamiento,nacionalidad,velocidad,empuje,peso,combustible,altura,capacidadCarga);

        //assert se valida que cumpla la condición que quiero probar
        assertEquals(nave1.toString(),naveL.toString());
        assertEquals("Saturno V",naveL.getNombre());

    }

    @Test
    public void deberiaCrearUnaNaveNoTripulada() throws ParseException {

        //arrange - preparación de los datos

        String nombre="Cassini Huygens";
        String fechaLanzamiento2= "1972/02/10";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaLanzamiento = sdf.parse(fechaLanzamiento2);
        String nacionalidad="Estados Unidos, ESA y ASI";
        Double velocidad=0.5;
        Double empuje=4.539;
        Double peso=5.712;
        String combustible="MMH y tetróxido de nitrógeno";
        Double altura=6.8;
        Double potencia=885.0;

        //act se ejecuta la funcionalidad que quiero probar
        NoTripulada nave2= new NoTripulada(nombre,fechaLanzamiento,nacionalidad,velocidad,empuje,peso,combustible,altura,potencia);
        NoTripulada naveNt= construirNoTripulada(nombre,fechaLanzamiento,nacionalidad,velocidad,empuje,peso,combustible,altura,potencia);

        //assert se valida que cumpla la condición que quiero probar
        assertEquals(nave2.toString(),naveNt.toString());
        assertEquals("Cassini Huygens",naveNt.getNombre());

    }


    @Test
    public void deberiaCrearUnaNaveTripulada() throws ParseException {

        //arrange - preparación de los datos

        String nombre="Apolo";
        String fechaLanzamiento2= "1996/02/10";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaLanzamiento = sdf.parse(fechaLanzamiento2);
        String nacionalidad="Estados Unidos";
        Double velocidad=11.08;
        Double empuje=65.0;
        Double peso=1.84;
        String combustible="Propelente";
        Double altura=8.5;
        Double potencia=2300.0;
        int pasajeros=3;

        //act se ejecuta la funcionalidad que quiero probar
        Tripulada nave3= new Tripulada(nombre,fechaLanzamiento,nacionalidad,velocidad,empuje,peso,combustible,altura,potencia,pasajeros);
        Tripulada naveT= construirTripulada(nombre,fechaLanzamiento,nacionalidad,velocidad,empuje,peso,combustible,altura,potencia,pasajeros);

        //assert se valida que cumpla la condición que quiero probar
        assertEquals(nave3.toString(),naveT.toString());
        assertEquals("Apolo",naveT.getNombre());

    }


}