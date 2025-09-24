package com.esolano.pooherencia;

public class ClsAlumnoInternacional extends ClsAlumno {

     private String pais;
     private double notaIdiomas;

     public ClsAlumnoInternacional(){
         System.out.println("AlumnoInternacional: inicializando constructor");
     }


    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
