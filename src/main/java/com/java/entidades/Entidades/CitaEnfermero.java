package com.java.entidades.Entidades;

import java.time.LocalDateTime;

import com.java.entidades.Enumeraciones.Procedimientos;

public class CitaEnfermero extends Cita implements IAgendamiento{

    public CitaEnfermero(LocalDateTime fecha, Paciente paciente, Procedimientos procedimientos, Enfermeros enfermeros) {
        super(fecha, paciente);
        this.procedimientos = procedimientos;
        this.enfermeros = enfermeros;
    }
    private Procedimientos procedimientos;
    private Enfermeros enfermeros;

    public Procedimientos getProcedimientos() {
        return procedimientos;
    }
    public void setProcedimientos(Procedimientos procedimientos) {
        this.procedimientos = procedimientos;
    }
    public Enfermeros getEnfermeros() {
        return enfermeros;
    }
    public void setEnfermeros(Enfermeros enfermeros) {
        this.enfermeros = enfermeros;
    }


    @Override
    public void agendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }
    @Override
    public void cancelarCita() {
        System.out.println("Cita para procedimiento: " + this.procedimientos + " cancelada");
    }
    @Override
    public void reagendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }
    @Override
    public String toString() {
        return "CitaEnfermero [fecha=" + fecha + ", paciente=" + paciente + ", procedimientos=" + procedimientos
                + ", enfermeros=" + enfermeros + "]";
    }
    
    
}
