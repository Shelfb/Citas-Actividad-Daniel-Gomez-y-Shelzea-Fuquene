package com.java.entidades.Entidades;

public class Consultorio {
    public Integer id;
    public String direccion;
    public long numero;

    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getDireccion() {
        return direccion;
    }



    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public long getNumero() {
        return numero;
    }



    public void setNumero(long numero) {
        this.numero = numero;
    }



    public Consultorio(Integer id, String direccion, long numero) {
        this.id = id;
        this.direccion = direccion;
        this.numero = numero;
    }
}
