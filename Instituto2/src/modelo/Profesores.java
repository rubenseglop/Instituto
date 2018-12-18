package modelo;
// Generated 02-dic-2018 21:50:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Profesores generated by hbm2java
 */
public class Profesores  implements java.io.Serializable {


     private String ccodprof;
     private String cnomprof;
     private String departam;
     private Set asignaturases = new HashSet(0);

    public Profesores() {
    }

	
    public Profesores(String ccodprof, String cnomprof, String departam) {
        this.ccodprof = ccodprof;
        this.cnomprof = cnomprof;
        this.departam = departam;
    }
    public Profesores(String ccodprof, String cnomprof, String departam, Set asignaturases) {
       this.ccodprof = ccodprof;
       this.cnomprof = cnomprof;
       this.departam = departam;
       this.asignaturases = asignaturases;
    }
   
    public String getCcodprof() {
        return this.ccodprof;
    }
    
    public void setCcodprof(String ccodprof) {
        this.ccodprof = ccodprof;
    }
    public String getCnomprof() {
        return this.cnomprof;
    }
    
    public void setCnomprof(String cnomprof) {
        this.cnomprof = cnomprof;
    }
    public String getDepartam() {
        return this.departam;
    }
    
    public void setDepartam(String departam) {
        this.departam = departam;
    }
    public Set getAsignaturases() {
        return this.asignaturases;
    }
    
    public void setAsignaturases(Set asignaturases) {
        this.asignaturases = asignaturases;
    }




}


