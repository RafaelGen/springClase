package com.spring.primerproy.inicio.comidacontrol;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComidaService {

    private List<Comida> listaComida = new ArrayList<>();
    private Comida comida1 = new Comida(1,"Tacos de carnitas",
            "Michoacan",25);
    private Comida comida2 = new Comida(2,"Pozole",
            "Jalisco",45);
    private Comida comida3 = new Comida(3,"Carnes en su jugo",
            "Jalisco",65);

    public ComidaService(){
        listaComida.add(comida1);
        listaComida.add(comida2);
        listaComida.add(comida3);
    }

    public List<Comida> getAllComida(){
        return listaComida;
    }

    public Comida getComida(int id) {
        for(Comida com : listaComida){
            if(com.getIdcomida()==id){
                return com;
            }
        }return null;
    }

    public void addComida(Comida comida) {
        listaComida.add(comida);
    }
}
