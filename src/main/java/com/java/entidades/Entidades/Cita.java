package com.java.entidades.Entidades;

import java.time.LocalDateTime;

public class Cita {

    protected LocalDateTime fecha;
    protected Paciente paciente;


    public Cita(LocalDateTime fecha, Paciente paciente) {
        this.fecha = fecha;
        this.paciente = paciente;
    }

    
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}