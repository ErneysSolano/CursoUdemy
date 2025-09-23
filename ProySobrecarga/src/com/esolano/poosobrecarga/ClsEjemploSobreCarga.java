package com.esolano.poosobrecarga;
import  static  com.esolano.poosobrecarga.ClsCalculadora.*; // asi llamo a todos los metodos de la clase y no es necesario usar el constructor
public class ClsEjemploSobreCarga {
    public static void main(String[] args) {


        System.out.println("sumar int : " + ClsCalculadora.sumar(10 , 2));
        System.out.println("sumar float : " + ClsCalculadora.sumar(10f, 2f));
        System.out.println("sumar String : " + ClsCalculadora.sumar("15", "45"));
        System.out.println("Sumar 4 int:  " + ClsCalculadora.sumar(10,5,2,3));
        System.out.println("Sumar 4 int:  " + ClsCalculadora.sumar(10.4,5,2,3));
        System.out.println("Sumar 4 float:  " + sumar(10.4,5.2,2.3,3.8));


    }

}
