package br.com.algoritmo.exer04;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		//Pedir o peso do peixe se for maior que 50 ia pagar multa
		
		float p, m;
		String e = "excesso";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o peso dos peixes");
		p = sc.nextFloat();
		
		
		if(p > 50) {
			m = (float) ((p - 50) * 4.00);
			System.out.println("Vc deverá pagar " + m);
		}else {
			m = 0;
			e = "0";
			System.out.println("Multas: " + m);
			System.out.println("Excesso: " + e);
		}
				
		
		sc.close();
	}

}
