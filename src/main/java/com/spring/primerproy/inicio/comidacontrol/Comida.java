package com.spring.primerproy.inicio.comidacontrol;

public class Comida {
    private int idcomida;
    private String nom_comida;
    private String origen;
    private int precio;

    public Comida(){}

    public Comida(int idcomida,String nom_comida, String origen, int precio) {
        this.idcomida = idcomida;
        this.nom_comida = nom_comida;
        this.origen = origen;
        this.precio = precio;
    }

    public int getIdcomida() {
        return idcomida;
    }

    public void setIdcomida(int idcomida) {
        this.idcomida = idcomida;
    }
    public String getNom_comida() {
        return nom_comida;
    }

    public void setNom_comida(String nom_comida) {
        this.nom_comida = nom_comida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
