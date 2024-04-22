package com.java.entidades.Entidades;

import java.time.LocalDateTime;

import com.java.entidades.Enumeraciones.EstadoCita;

//Implements para heredar comportamientos PERO solo con interfaces

public class CitaMedico extends Cita implements IAgendamiento{

    private String motivoConsulta;
    private Medico medico;
    private EstadoCita estadoCita;

    public CitaMedico(LocalDateTime fecha, Paciente paciente, String motivoConsulta, Medico medico, EstadoCita estadoCita) {
        super(fecha, paciente);
        this.motivoConsulta = motivoConsulta;
        this.medico = medico;
        this.estadoCita = estadoCita;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        this.setFecha(fecha);
        this.setEstadoCita(estadoCita.AGENDADA);
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }
    @Override
    public void cancelarCita() {
        this.estadoCita = EstadoCita.CANCELADA;
        System.out.println("La cita con el especialista " + this.medico.getNombres() + " fue cancelada");
    }
    @Override
    public void reagendarCita(LocalDateTime fecha) {
        this.setFecha(fecha);
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }

    @Override
    public String toString() {
        return "CitaMedico [fecha=" + fecha + ", paciente=" + paciente + ", medico=" + medico + "]";
    }

}
