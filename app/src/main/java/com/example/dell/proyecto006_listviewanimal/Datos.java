package com.example.dell.proyecto006_listviewanimal;

import java.io.Serializable;

/**
 * Created by dell on 11/10/2017.
 */

public class Datos implements Serializable{
    private int id;
    private String titulo;
    private String detalle;
    private int imagen;
    private int sonido;

    public Datos(int id, String titulo, String detalle, int imagen, int sonido) {
        this.id = id;
        this.titulo = titulo;
        this.detalle = detalle;
        this.imagen = imagen;
        this.sonido = sonido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getSonido() { return sonido;}

    public void setSonido(int sonido) { this.sonido = sonido; }
}
