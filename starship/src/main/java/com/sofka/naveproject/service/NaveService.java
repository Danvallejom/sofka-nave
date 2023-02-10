package com.sofka.naveproject.service;

import com.sofka.naveproject.domain.model.Nave;

import java.util.List;

public interface NaveService {
    void guardar(Nave nave, List<Nave> listaNaves);
    Nave consultar(String nombre,List<Nave> nave);
}
