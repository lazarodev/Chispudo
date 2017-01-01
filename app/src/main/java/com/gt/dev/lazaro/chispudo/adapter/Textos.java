package com.gt.dev.lazaro.chispudo.adapter;

/**
 * Created by Lazarus on 31/12/2016.
 */

public class Textos {

    private String titulo, description;

    public Textos(String titulo, String description) {
        super();
        this.titulo = titulo;
        this.description = description;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
