package com.alvardev.demos.favoriteplaces;

import java.io.Serializable;

public class ItemEntity implements Serializable{

    private int imagen;
    private String titulo;
    private String puntaje;

    public ItemEntity() {
    }

    public ItemEntity(int imagen, String titulo, String puntaje) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.puntaje = puntaje;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "ItemEntity{" +
                "imagen=" + imagen +
                ", titulo='" + titulo + '\'' +
                ", puntaje='" + puntaje + '\'' +
                '}';
    }
}
