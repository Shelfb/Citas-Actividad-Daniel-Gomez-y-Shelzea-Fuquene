package com.java.entidades.Entidades;

import com.java.entidades.Enumeraciones.TipoDocumento;

abstract class Usuario {
    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoDocumento TipoDocumento;
    private long numeroDocumento;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Usuario(Integer id, String nombres, String apellidos,
            com.java.entidades.Enumeraciones.TipoDocumento tipoDocumento, long numeroDocumento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        TipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    
}
