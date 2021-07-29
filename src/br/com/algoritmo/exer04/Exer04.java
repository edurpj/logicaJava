package br.com.algoritmo.exer04;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		
		char sexo;
		float altura, pesoI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sexo m/f");
		sexo = sc.next().charAt(0);
		
		System.out.println("Digite a altura: ");
		altura = sc.nextFloat();
		
		if(sexo == 'm' ) {
			
			pesoI = (float) ((altura * 72.7) - 58);
			System.out.println("Peso ideal é " + pesoI);
		}else 
		{
			pesoI = (float) ((altura * 62.1) - 44.7);
			System.out.println("Peso ideal: " + pesoI);
		}
		
		
		
		sc.close();
	}

}
