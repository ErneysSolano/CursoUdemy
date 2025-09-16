package com.esolano.poosobrecarga;

public class ClsEjemploSobreCarga {
    public static void main(String[] args) {

        ClsCalculadora cal = new ClsCalculadora();

        System.out.println("sumar int : " + cal.sumar(10 , 2));
        System.out.println("sumar float : " + cal.sumar(10f, 2f));
        System.out.println("sumar String : " + cal.sumar("15", "45"));
    }

}
