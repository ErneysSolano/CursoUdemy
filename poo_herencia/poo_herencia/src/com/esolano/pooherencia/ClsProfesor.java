package com.esolano.pooherencia;

public class ClsProfesor extends  ClsPersona {
    private String asignatura;

    public ClsProfesor(){
        System.out.println("Profesor: Inicializando constructor ...");
    }

    public  ClsProfesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public  ClsProfesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

 //-------getter y setter --------------------------*/
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos dias soy el profesor de " + getAsignatura() + ", mi nombre es " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura;
    }
}
