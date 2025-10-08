package com.esolano.app;

import com.esolano.bllt.ClsBilletes;
import com.esolano.mnd.ClsMnds;


import java.util.Scanner;

public class ClsApp {
    public static void main(String[] args) {

        int acumMnds = 0;

      Scanner sc = new Scanner(System.in);
        ClsMnds  mnds = new ClsMnds();
        System.out.println("Ingrese valor mnd50");
        mnds.setMnd50(sc.nextInt());
        while(mnds.getMnd50() != 1000 && mnds.getMnd50() != 2000) {
            System.out.println("Valor mnd50 invalido");
            mnds.setMnd50(sc.nextInt());
        }
        System.out.println("Ingrese valor mnd100");
        mnds.setMnd100(sc.nextInt());


        acumMnds += mnds.getMnd100() + mnds.getMnd50();

        System.out.println("valor acum " +  acumMnds);
    }
}
