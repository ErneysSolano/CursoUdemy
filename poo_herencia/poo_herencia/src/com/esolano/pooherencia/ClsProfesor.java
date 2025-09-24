package com.esolano.pooherencia;

public class ClsProfesor extends  ClsPersona {
    private String asignatura;

    public ClsProfesor(){
        System.out.println("Profesor: Inicializando constructor ...");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
