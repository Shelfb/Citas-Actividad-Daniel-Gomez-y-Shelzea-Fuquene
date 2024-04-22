package com.java.entidades.Entidades;

import com.java.entidades.Enumeraciones.Especialidad;
import com.java.entidades.Enumeraciones.Procedimientos;

public class Medico extends Usuario{
    private Long RegistroMedico;
    private Especialidad especialidad;
    private Procedimientos procedimientos;
    
    public Long getRegistroMedico() {
        return RegistroMedico;
    }


    public void setRegistroMedico(Long registroMedico) {
        RegistroMedico = registroMedico;
    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    public Procedimientos getProcedimientos() {
        return procedimientos;
    }


    public void setProcedimientos(Procedimientos procedimientos) {
        this.procedimientos = procedimientos;
    }


    public Medico(Integer id, String nombres, String apellidos,
            com.java.entidades.Enumeraciones.TipoDocumento tipoDocumento, long numeroDocumento, Long registroMedico,
            Especialidad especialidad, Procedimientos procedimientos) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        RegistroMedico = registroMedico;
        this.especialidad = especialidad;
        this.procedimientos = procedimientos;
    }


    @Override
    public String toString() {
        return "Medico [especialidad=" + especialidad + ", getNombres()=" + getNombres() + ", getApellidos()="
                + getApellidos() + "]";
    }

    //Comportamiento

    }
