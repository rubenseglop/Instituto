package modelo;
// Generated 02-dic-2018 21:50:03 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Expedientes generated by hbm2java
 */
public class Expedientes  implements java.io.Serializable {


     private ExpedientesId id;
     private Asignaturas asignaturas;
     private Alumnos alumnos;
     private BigDecimal nota;

    public Expedientes() {
    }

    public Expedientes(ExpedientesId id, Asignaturas asignaturas, Alumnos alumnos, BigDecimal nota) {
       this.id = id;
       this.asignaturas = asignaturas;
       this.alumnos = alumnos;
       this.nota = nota;
    }
   
    public ExpedientesId getId() {
        return this.id;
    }
    
    public void setId(ExpedientesId id) {
        this.id = id;
    }
    public Asignaturas getAsignaturas() {
        return this.asignaturas;
    }
    
    public void setAsignaturas(Asignaturas asignaturas) {
        this.asignaturas = asignaturas;
    }
    public Alumnos getAlumnos() {
        return this.alumnos;
    }
    
    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }
    public BigDecimal getNota() {
        return this.nota;
    }
    
    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }




}


