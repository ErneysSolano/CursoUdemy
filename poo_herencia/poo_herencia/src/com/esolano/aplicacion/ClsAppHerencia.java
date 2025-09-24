package com.esolano.aplicacion;

import com.esolano.pooherencia.ClsAlumno;
import com.esolano.pooherencia.ClsAlumnoInternacional;
import com.esolano.pooherencia.ClsProfesor;

public class ClsAppHerencia {
    public static void main(String[] args) {

        System.out.println("================creando instancia de la clase alumno");
        ClsAlumno alumno = new ClsAlumno();
        alumno.setNombre("Erneys");
        alumno.setApellido("Solano");
        alumno.setInstitucion("I.E.R Santa Catalina");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(4.5);
        alumno.setNotaMatematica(4.8);

        System.out.println("================creando instancia de la clase alumnoInternacional");
        ClsAlumnoInternacional alumnInter = new ClsAlumnoInternacional();
        alumnInter.setNombre("Peter");
        alumnInter.setApellido("Gosling");
        alumnInter.setPais("Australia");
        alumnInter.setEdad(15);
        alumnInter.setInstitucion("Instituto Internacional");
        alumnInter.setNotaIdiomas(4.5);
        alumnInter.setNotaCastellano(4.3);
        alumnInter.setNotaHistoria(4.8);
        alumnInter.setNotaMatematica(4.1);

        System.out.println("================creando instancia de la clase profesor");
        ClsProfesor profe = new ClsProfesor();
        profe.setNombre("Juan");
        profe.setApellido("Quintero");
        profe.setAsignatura("Sociales");


        System.out.println(alumno.getNombre()
                           + " " + alumno.getApellido()
                           + " " + alumno.getInstitucion());

        System.out.println(alumnInter.getNombre()
                + " " + alumnInter.getApellido()
                + " " + alumnInter.getInstitucion()
                + " " + alumnInter.getPais());

        System.out.println("Profesor " + profe.getAsignatura()
                          + ": " + profe.getNombre()
                          + " "+ profe.getApellido());

        Class clase =  alumnInter.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + "es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
}
