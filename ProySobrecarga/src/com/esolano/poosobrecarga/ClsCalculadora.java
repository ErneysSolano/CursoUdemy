package com.esolano.poosobrecarga;

public class ClsCalculadora {
    //---> se puede colocar el mismo nombre a varios metodos ya que no
    //-- tienen los mismos tipos de datos

    public int sumar(int a, int b){
        return a+b;
    }

    public float sumar(float a, int b){
        return a + b;
    }

    public float sumar(float c, float d){
        return c + d;
    }

    public int sumar (String e, String f){
        int resultado;
        try {
            resultado = Integer.parseInt(e) + Integer.parseInt(f);
        }catch (NumberFormatException q){
            resultado = 0;
        }
        return resultado;
    }
}
