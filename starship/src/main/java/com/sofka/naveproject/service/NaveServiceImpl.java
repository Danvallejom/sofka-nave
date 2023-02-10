package com.sofka.naveproject.service;

import com.sofka.naveproject.domain.model.Nave;
import com.sofka.naveproject.domain.model.NavesExploradoras;
import org.springframework.stereotype.Repository;

import java.util.List;


public class NaveServiceImpl implements NaveService {


    @Override
    public void guardar(Nave nave, List<Nave> listaNaves) {
        listaNaves.add(nave);
    }

    @Override
    public Nave consultar(String nombre,List<Nave> listaNaves) {

      return  listaNaves.stream().filter(item->item.getNombre().equalsIgnoreCase(nombre))
              .findFirst()
              .orElse(null);
  
    }
}
