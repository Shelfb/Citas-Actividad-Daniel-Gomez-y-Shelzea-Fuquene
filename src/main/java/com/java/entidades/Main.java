package com.java.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import com.java.entidades.Entidades.CitaEnfermero;
import com.java.entidades.Entidades.CitaMedico;
import com.java.entidades.Entidades.Consultorio;
import com.java.entidades.Entidades.Enfermeros;
import com.java.entidades.Entidades.Medico;
import com.java.entidades.Entidades.Paciente;
import com.java.entidades.Enumeraciones.Especialidad;
import com.java.entidades.Enumeraciones.EstadoCita;
import com.java.entidades.Enumeraciones.Procedimientos;
import com.java.entidades.Enumeraciones.TipoDocumento;
import com.java.entidades.Enumeraciones.TipoSangre;

public class Main {
    public static void main(String[] args) {

        Medico m = new Medico(1,
                        "Juan", 
                        "Diaz", 
                        TipoDocumento.CM, 
                        1028834065L, 
                        1234567890L, 
                        Especialidad.CARDIOLOGIA,
                        Procedimientos.CUIDADOS_PALIATIVOS);

        Medico M = new Medico(2,
                        "Alberto", 
                        "Pacheco", 
                        TipoDocumento.CC, 
                        1028839876L, 
                        5432167890L, 
                        Especialidad.NEUROLOGIA,
                        Procedimientos.PROCEDIMIENTOS_AMBULATORIOS);

        System.out.println("Especialidad: "+ m.getEspecialidad());


        Paciente p = new Paciente(1, 
                                    "Daniel", 
                                    "Gómez", 
                                    TipoDocumento.TI, 
                                    1012911234L, 
                                    "dgmz@gmail.com", 
                                    3148732461L, 
                                    LocalDate.of(2006, Month.SEPTEMBER, 03), 
                                    1.70, 
                                    60.0, 
                                    TipoSangre.O, 
                                    '+');

        Paciente P = new Paciente(2, 
                                    "Andrés", 
                                    "Gonzales", 
                                    TipoDocumento.RC, 
                                    31265234L, 
                                    "andGon@gmail.com", 
                                    3344352461L, 
                                    LocalDate.of(2009, Month.JUNE, 01), 
                                    1.50, 
                                    70.0, 
                                    TipoSangre.AB, 
                                    '+');

        Paciente pa = new Paciente(3, 
                                    "Esteban", 
                                    "Tapia", 
                                    TipoDocumento.CE, 
                                    1012911928L, 
                                    "Tapia1234@gmail.com", 
                                    9328432461L, 
                                    LocalDate.of(2003, Month.DECEMBER, 24), 
                                    190.0, 
                                    45.0, 
                                    TipoSangre.A, 
                                    '+');

        Paciente pac = new Paciente(4, 
                                    "Daniel", 
                                    "Gómez", 
                                    TipoDocumento.TI, 
                                    1012911234L, 
                                    "dgmz@gmail.com", 
                                    657732461L, 
                                    LocalDate.of(2018, Month.MARCH, 30), 
                                    170.0, 
                                    60.0, 
                                    TipoSangre.B, 
                                    '+');

        Paciente paci = new Paciente(5, 
                                    "Julian", 
                                    "Vanegas", 
                                    TipoDocumento.CC, 
                                    10197482664L, 
                                    "VannJul@gmail.com", 
                                    3143970061L, 
                                    LocalDate.of(2006, Month.SEPTEMBER, 19), 
                                    1.50, 
                                    60.0, 
                                    TipoSangre.D, 
                                    '+');

        System.out.println("Nombres: "+ p.getNombres());

        Consultorio c =new Consultorio(67, 
        "Cra 81c #65-42 sur", 
        117);

        System.out.println("numero: " + c.getNumero());


        Enfermeros e =new Enfermeros(1, 
                                        "Yeison", 
                                        "Morales", 
                                        TipoDocumento.CC, 
                                        102291829L, 
                                        Procedimientos.VACUNACION);

        Enfermeros en =new Enfermeros(2, 
                                        "Duvan", 
                                        "Sanchez", 
                                        TipoDocumento.CC, 
                                        100673029L, 
                                        Procedimientos.PROCEDIMIENTOS_AMBULATORIOS);

        Enfermeros enf =new Enfermeros(3, 
                                        "Samuel", 
                                        "Buirago", 
                                        TipoDocumento.CC, 
                                        100238479L, 
                                        Procedimientos.VACUNACION);

        System.out.println("numeroDocumento: " + e.getNumeroDocumento());

        CitaMedico cm = new CitaMedico(LocalDateTime.of(2024, Month.APRIL, 22, 10, 35, 00),
                                P,
                                "Gripa",
                                m, 
                                EstadoCita.AGENDADA);
        System.out.println(cm);

        CitaMedico cm1 = new CitaMedico(LocalDateTime.of(2024, Month.APRIL, 22, 11, 00), p, "Escopolamina", M, EstadoCita.REALIZADA);
        System.out.println("Estado de la cita al inicio:"+ cm1.getEstadoCita());
        System.out.println(cm1);
        cm1.cancelarCita();
        System.out.println("Estado de la cita despues de cancelar: "+ cm1.getEstadoCita());

        CitaEnfermero ce = new CitaEnfermero(LocalDateTime.of(2024, Month.APRIL, 22, 12, 30, 00), pac, Procedimientos.VACUNACION, en);
        System.out.println(ce);

        CitaEnfermero ce1 = new CitaEnfermero(LocalDateTime.of(2024, Month.AUGUST, 15, 11, 05, 03), paci, Procedimientos.LAVADO_OIDOS, enf);
        System.out.println(ce1);



    }

}