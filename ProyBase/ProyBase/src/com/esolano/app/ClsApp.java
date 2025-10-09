package com.esolano.app;

import com.esolano.mnd.ClsMnds;

import java.util.Scanner;

public class ClsApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int acumMnds = 0;
		while (true) {
			ClsMnds mnds = new ClsMnds();
			System.out.println("Ingrese valor mnd50");
			mnds.setMnd50(sc.nextInt());
			while (mnds.getMnd50() != 1000 && mnds.getMnd50() != 2000) {
				System.out.println("Valor mnd50 invalido");
				mnds.setMnd50(sc.nextInt());
			}
			acumMnds += mnds.getMnd50();
			//
			System.out.println("Ingrese valor mnd100");
			mnds.setMnd100(sc.nextInt());
			while (mnds.getMnd100() != 4000 && mnds.getMnd100() != 2000) {
				System.out.println("Valor mnd100 invalido");
				mnds.setMnd100(sc.nextInt());
			}
			acumMnds += mnds.getMnd100();
			//
			System.out.println("Ingrese valor mnd200");
			mnds.setMnd200(sc.nextInt());
			while (mnds.getMnd200() != 5000) {
				System.out.println("Valor mnd200 invalido");
				mnds.setMnd200(sc.nextInt());
			}
			acumMnds += mnds.getMnd200();
			if (acumMnds > 10000) {
				break;
			}
			//
			System.out.println("Ingrese valor mnd500");
			mnds.setMnd500(sc.nextInt());
			while (mnds.getMnd500() != 10000 && mnds.getMnd500() != 5000) {
				System.out.println("Valor mnd500 invalido");
				mnds.setMnd500(sc.nextInt());
			}
			acumMnds += mnds.getMnd200();
			if (acumMnds > 10000) {
				break;
			}
			//
			System.out.println("Ingrese valor mnd1000");
			mnds.setMnd1000(sc.nextInt());
			while (mnds.getMnd1000() != 10000) {
				System.out.println("Valor mnd1000 invalido");
				mnds.setMnd1000(sc.nextInt());
			}

		}

		System.out.println("El acumulado es: " + acumMnds);
	}


}
