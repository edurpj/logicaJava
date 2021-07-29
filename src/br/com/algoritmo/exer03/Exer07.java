package br.com.algoritmo.exer03;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		float altura, pesoI;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		altura = sc.nextFloat();
		
		pesoI = (float) ((72.7 * altura) - 58);
		
		System.out.println("Peso ideal: " + pesoI);
		
		
		
		sc.close();
	}

}
