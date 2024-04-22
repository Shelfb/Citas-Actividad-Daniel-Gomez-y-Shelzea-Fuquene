package com.java.entidades.Entidades;

import java.time.LocalDate;

import com.java.entidades.Enumeraciones.TipoSangre;

public class Paciente extends Usuario{
    private String correoElectronico;
    private Long celular;
    private LocalDate fechaNacimiento;
    private double altura;
    private double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    public String getCorreoElectronico() {
        return correoElectronico;
    }



    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }



    public Long getCelular() {
        return celular;
    }



    public void setCelular(Long celular) {
        this.celular = celular;
    }



    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }



    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public double getAltura() {
        return altura;
    }



    public void setAltura(double altura) {
        this.altura = altura;
    }



    public double getPeso() {
        return peso;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }



    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }



    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }



    public char getFactorRH() {
        return factorRH;
    }



    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }



    public Paciente(Integer id, String nombres, String apellidos,
            com.java.entidades.Enumeraciones.TipoDocumento tipoDocumento, long numeroDocumento,
            String correoElectronico, Long celular, LocalDate fechaNacimiento, double altura, double peso,
            TipoSangre tipoSangre, char factorRH) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }



    @Override
    public String toString() {
        return "Paciente [correoElectronico=" + correoElectronico + ", altura=" + altura + ", peso=" + peso
                + ", tipoSangre=" + tipoSangre + ", factorRH=" + factorRH + ", getNombres()=" + getNombres()
                + ", getApellidos()=" + getApellidos() + "]";
    }
   
}
