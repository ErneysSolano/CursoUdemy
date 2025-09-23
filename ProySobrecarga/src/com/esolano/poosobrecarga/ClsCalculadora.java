package com.esolano.poosobrecarga;

public class ClsCalculadora {
    //---> se puede colocar el mismo nombre a varios metodos ya que no
    //-- tienen los mismos tipos de datos


    public ClsCalculadora() {
    }

    public static int sumar(int... argumentos){
         int total = 0;
         for(int i: argumentos){
             total+= i;
         }
         return  total;
     }

    public static float sumar(float a ,int... argumentosflt){
        float total = 0;
        for(int i: argumentosflt){
            total+= i;
        }
        return  total;
    }
    public static double sumar(double... vargumentos){
        double total = 0.0;
        for(double d : vargumentos){
            total += d;
        }
        return   total;
    }

    public static int sumar(int a, int b){
        return a+b;
    }

    public static float sumar(float a, int b){
        return a + b;
    }

    public static float sumar(float c, float d){
        return c + d;
    }

    public static int sumar (String e, String f){
        int resultado;
        try {
            resultado = Integer.parseInt(e) + Integer.parseInt(f);
        }catch (NumberFormatException q){
            resultado = 0;
        }
        return resultado;
    }
}
