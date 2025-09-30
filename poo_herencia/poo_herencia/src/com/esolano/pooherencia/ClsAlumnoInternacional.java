package com.esolano.pooherencia;

public class ClsAlumnoInternacional extends ClsAlumno {

     private String pais;
     private double notaIdiomas;

     public ClsAlumnoInternacional(){
         System.out.println("AlumnoInternacional: inicializando constructor");
     }

     public ClsAlumnoInternacional(String nombre, String apellido){
        super(nombre,apellido);
    }

    public ClsAlumnoInternacional(String nombre, String apellido, String pais, double notaIdiomas){
        super(nombre,apellido);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    //-------getter y setter --------------------------*/
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

    @Override
    public String saludar() {
        return super.saludar() + " soy un alumno extranjero del pais " + getPais();
    }

    @Override
    public double calcularPromedio() {
        System.out.println("calcularPromedio " + ClsAlumnoInternacional.class.getCanonicalName()); //--> se revisa que metodo esta llamando
        return ((super.calcularPromedio()*3) + notaIdiomas)/4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
