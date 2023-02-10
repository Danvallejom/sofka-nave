package com.sofka.naveproject.application;


import com.sofka.naveproject.domain.model.Nave;
import com.sofka.naveproject.service.NaveService;
import com.sofka.naveproject.service.NaveServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static com.sofka.naveproject.domain.factory.NaveFactory.*;

import static com.sofka.naveproject.domain.model.Lanzadera.desplegar;
import static com.sofka.naveproject.domain.model.NoTripulada.*;
import static com.sofka.naveproject.domain.model.Tripulada.*;


public class InicioAplicacion {





    public static String accion(int eleccion1,int eleccion2){
        String msj = null;

        if (eleccion1 != 1 || eleccion1 != 2 ||eleccion1 != 3){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese nuevamente el tipo de nave (1. Lanzadera, 2.Nave Tripulada, 3. Nave no Tripulada ");
            eleccion1 = Integer.parseInt(input.nextLine());
        }

        if (eleccion1 == 2 ) {
            if (eleccion2 == 1){
                msj = acoplar1();
            } else if (eleccion2 == 2) {
                msj = activarRCS1 ();
            } else if (eleccion2 == 3) {
                msj = orbitar1();
            } else if (eleccion2 == 4) {
                msj = tomarFotos1();
            } else if (eleccion2 == 5) {
                msj = tomarMuestras1();
            } else if (eleccion2 == 6) {
                msj = despresurizar1();
            } else if (eleccion2 == 7) {
                msj = activarOMS1();
            } else if (eleccion2 == 8) {
                msj = desplegarParacaidas1();
            } else if (eleccion2 == 9) {
                msj = planear1();
            }

        } else if (eleccion1 == 3 ){
            if (eleccion2 == 1){
                msj = acoplar2();
            } else if (eleccion2 == 2) {
                msj = activarRCS2();
            } else if (eleccion2 == 3) {
                msj = orbitar2();
            } else if (eleccion2 == 4) {
                msj = tomarFotos2();
            } else if (eleccion2 == 5) {
                msj = tomarMuestras2();
            } else if (eleccion2 == 6) {
                msj = despresurizar2();
            } else if (eleccion2 == 7) {
                msj = activarOMS2();
            } else if (eleccion2 == 8) {
                msj = desplegarParacaidas2();
            } else if (eleccion2 == 9) {
                msj = planear2();
            }

        } else if (eleccion1 ==1){
            if (eleccion2 == 10){
                msj = desplegar();
            } else if (eleccion2  != 10){
                msj = "Esta acción no puede ser realizada por la lanzadera";
            }
        } else {
            msj = "El número ingresado es incorrecto";
        }

        return msj;
        }







    public static void main(String[] args)  {

        NaveService naveActual = new NaveServiceImpl();
        int opcion = -1;
        Scanner input = new Scanner(System.in);

        List<Nave> listaNaves= new ArrayList<>();

        while (opcion != 0) {
            System.out.println("\nIngresar una opción, por favor" + "\n1. Crear una nave Lanzadera" + "\n2. Crear una nave Tripulada"
                    + "\n3. Crear una nave no tripulada"
                    + "\n4. Consultar una nave"
                    + "\n0. Salir del programa");

            opcion = Integer.parseInt(input.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la nave: ");
                    String nombre = input.nextLine();

                    System.out.println("Ingrese la fecha inicial: ");
                    String fecha = input.nextLine();

                    Date fechaLanzamiento = new Date();

                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        fechaLanzamiento = sdf.parse(fecha);
                    } catch (ParseException ex) {
                        ex.getLocalizedMessage();
                    }

                    System.out.println("Ingrese la nacionalidad de la nave: ");
                    String nacionalidad = input.nextLine();

                    System.out.println("Ingrese la velocidad en km/s: ");
                    Double velocidad = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese el empuje en toneladas: ");
                    Double empuje = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese el peso en toneladas: ");
                    Double peso = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese el tipo de combustible de la nave: ");
                    String combustible = input.nextLine();

                    System.out.println("Ingrese la altura de la nave en metros: ");
                    Double altura = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese la capacidad de carga en toneladas: ");
                    Double capacidadCarga = Double.parseDouble(input.nextLine());

                    naveActual.guardar(construirLanzadera(nombre, fechaLanzamiento, nacionalidad, velocidad, empuje, peso, combustible, altura, capacidadCarga), listaNaves);

                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la nave: ");
                    String nombre2 = input.nextLine();

                    System.out.println("Ingrese la fecha inicial: ");
                    String fecha2 = input.nextLine();

                    Date fechaLanzamiento2 = new Date();

                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        fechaLanzamiento2 = sdf.parse(fecha2);
                    } catch (ParseException ex) {
                        ex.getLocalizedMessage();
                    }

                    System.out.println("Ingrese la nacionalidad de la nave: ");
                    String nacionalidad2 = input.nextLine();

                    System.out.println("Ingrese la velocidad en km/s: ");
                    Double velocidad2 = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese el empuje en toneladas: ");
                    Double empuje2 = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese el peso en toneladas: ");
                    Double peso2 = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese el tipo de combustible de la nave: ");
                    String combustible2 = input.nextLine();

                    System.out.println("Ingrese la altura de la nave en metros: ");
                    Double altura2 = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese la capacidad de potencia en watts: ");
                    Double potencia = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese la cantidad de pasajeros: ");
                    int pasajeros = Integer.parseInt(input.nextLine());

                    naveActual.guardar(construirTripulada(nombre2, fechaLanzamiento2, nacionalidad2, velocidad2, empuje2, peso2, combustible2, altura2, potencia, pasajeros), listaNaves);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la nave: ");
                    String nombre3 = input.nextLine();

                    System.out.println("Ingrese la fecha inicial: ");
                    String fecha3 = input.nextLine();

                    Date fechaLanzamiento3 = new Date();

                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        fechaLanzamiento3 = sdf.parse(fecha3);
                    } catch (ParseException ex) {
                        ex.getLocalizedMessage();
                    }
                    System.out.println("Ingrese la nacionalidad de la nave: ");
                    String nacionalidad3 = input.nextLine();

                    System.out.println("Ingrese la velocidad en km/s: ");
                    Double velocidad3 = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese el empuje en toneladas: ");
                    Double empuje3 = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese el peso en toneladas: ");
                    Double peso3 = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese el tipo de combustible de la nave: ");
                    String combustible3 = input.nextLine();

                    System.out.println("Ingrese la altura de la nave en metros: ");
                    Double altura3 = Double.parseDouble(input.nextLine());

                    System.out.println("Ingrese la potencia en watts: ");
                    Double potencia2 = Double.parseDouble(input.nextLine());

                    naveActual.guardar(construirNoTripulada(nombre3, fechaLanzamiento3, nacionalidad3, velocidad3, empuje3, peso3, combustible3, altura3, potencia2), listaNaves);
                case 4:
                    System.out.println("Ingrese el nombre  de la nave que desea buscar: ");
                    String buscar = input.nextLine();
                    Nave buscado = naveActual.consultar(buscar, listaNaves);
                    System.out.println(buscado.toString());



                    System.out.println("\nIngresar el tipo de acción a realizar por la nave" + "\n1. Acoplar" + "\n2. Activar RCS"
                            + "\n3. Orbitar"
                            + "\n4. Tomar fotografías"
                            + "\n5. Tomar muestras"
                            + "\n6. Despresurizar"
                            + "\n7. Activar OMS"
                            + "\n8. Desplegar el paracaídas"
                            + "\n9. Planear"
                            + "\n10. Despliegue de la lanzadera");

                    int eleccion1 = opcion;
                    int eleccion2 = Integer.parseInt(input.nextLine());
                    System.out.println(accion(eleccion1,eleccion2));


                    break;
                case 0:
                    System.out.println("Has salido del programa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Has ingresado una opción invalida. ¡Inténtalo de nuevo!");
                    break;
            }

        }
        input.close();

    }

}
