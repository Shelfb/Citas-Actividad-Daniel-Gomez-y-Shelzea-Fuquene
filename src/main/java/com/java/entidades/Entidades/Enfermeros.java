package com.java.entidades.Entidades;

import com.java.entidades.Enumeraciones.Procedimientos;

public class Enfermeros extends Usuario{
      private Procedimientos procedimientos;

      public Procedimientos getProcedimientos() {
            return procedimientos;
        }
    
    
        public void setProcedimientos(Procedimientos procedimientos) {
            this.procedimientos = procedimientos;
        }
    

    public Enfermeros(Integer id, String nombres, String apellidos,
                  com.java.entidades.Enumeraciones.TipoDocumento tipoDocumento, long numeroDocumento, Procedimientos procedimientos) {
            super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
            this.procedimientos = procedimientos;
            //TODO Auto-generated constructor stub
      }

      
}
