package br.com.algoritmo.exer03;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		//Converter metros em cm
		
		float metros, cm;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os metros");
		metros = sc.nextFloat();
		
		cm = metros * 100;
		
		System.out.println("Metros convertidos para cm: " + cm + "cm");
		
		
		sc.close();
	}

}
