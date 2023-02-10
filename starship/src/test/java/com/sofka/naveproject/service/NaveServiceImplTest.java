package com.sofka.naveproject.service;

import com.sofka.naveproject.domain.model.Nave;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import java.util.ArrayList;
import java.util.List;


public class NaveServiceImplTest {

    @Test
    public void deberiaDarNull(){
        //arrange
        NaveService naveService= new NaveServiceImpl();
        String nombre="Fulano";
        List<Nave> list= new ArrayList<>();
        //act

        Nave resultado= naveService.consultar(nombre,list);

        //assert
        AssertionErrors.assertNull("quedaría null",resultado);

    }

}