package com.co.yeimy.models;

public class Episode implements Rating {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalViews;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getRating(){
        if (totalViews>100) {
            return 4;
        }else{
            return 2;
        }
    }
}
