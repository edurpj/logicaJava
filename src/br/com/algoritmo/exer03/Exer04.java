package br.com.algoritmo.exer03;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		//Somar 2 números
		
		int num1, num2, soma;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();

		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();

		soma = num1 + num2;


		System.out.println("Resultado = " + soma);

		sc.close();

	}

}
