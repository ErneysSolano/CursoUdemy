package com.esolano.aplicacion;

import com.esolano.pooherencia.*;

public class ClsAppHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("================creando instancia de la clase alumno");
        ClsAlumno alumno = new ClsAlumno("Erneys","Solano",24,"I.E.R Santa Catalina");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(4.5);
        alumno.setNotaMatematica(4.8);
        alumno.setEmail("Daveys124@gmail.com");

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
        ClsProfesor profe = new ClsProfesor("Juan","Quintero");
        profe.setAsignatura("Sociales");

        imprimir(alumno);
        imprimir(alumnInter);
        imprimir(profe);


    }

    public static  void imprimir(ClsPersona persona){
        System.out.println("Imprimiendo los datos en comun del tipo persona--------");
        System.out.println("nombre: " + persona.getNombre()
                + ", apllido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());
        if (persona instanceof ClsAlumno){
            System.out.println("Imprimiendo os datos del tipo alumno----------");
            System.out.println("Institucion: " + ((ClsAlumno)persona).getInstitucion());
            System.out.println("Nota matematicas: " +((ClsAlumno)persona).getNotaMatematica());
            System.out.println("Nota historia: " +((ClsAlumno)persona).getNotaHistoria());
            if(persona instanceof  ClsAlumnoInternacional){
                System.out.println("Imprimiendo os datos del tipo alumno internacional------------");
                System.out.println("Nota Idiomas: " +((ClsAlumnoInternacional)persona).getNotaIdiomas());
                System.out.println("Pais: " + ((ClsAlumnoInternacional)persona).getPais());
            }
            System.out.println("=====================================");
            System.out.println("Promedio: " + ((ClsAlumno) persona).calcularPromedio());
            System.out.println("=====================================");
        }

        if(persona instanceof ClsProfesor){
            System.out.println("Imprimiendo os datos del tipo alumno---------------");
            System.out.println("Asignatura: " + ((ClsProfesor)persona).getAsignatura());
        }

        System.out.println("==========Sobre escritura saludar===============");
        System.out.println(persona.saludar());
        System.out.println("=====================================");

    }



}
