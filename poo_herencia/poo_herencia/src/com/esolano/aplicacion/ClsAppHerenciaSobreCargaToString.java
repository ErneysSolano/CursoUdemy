package com.esolano.aplicacion;

import com.esolano.pooherencia.ClsAlumno;
import com.esolano.pooherencia.ClsAlumnoInternacional;
import com.esolano.pooherencia.ClsPersona;
import com.esolano.pooherencia.ClsProfesor;

public class ClsAppHerenciaSobreCargaToString {
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
        System.out.println("===============================");
        System.out.println(persona);
    }



}
