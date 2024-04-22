package com.java.entidades.Entidades;
import java.time.LocalDateTime;
public interface IAgendamiento {

        //definiciones de metodos
        //solo se ponen las firmas de metodo
        //porque la implementacion(instrucciones)()
        //corren por cuenta de otras clases
        
        public void agendarCita(LocalDateTime fecha);
        public void cancelarCita();
        public void reagendarCita(LocalDateTime fecha);
}
