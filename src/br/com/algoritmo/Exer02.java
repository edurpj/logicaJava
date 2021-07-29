package br.com.algoritmo;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		//Receber 2 números e multiplicar o resultado pelo segundo
		
		int num1 ,num2, soma, mult;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		mult = soma * num2;
		
		System.out.println("Resultado = " + mult);
		
		
		
		sc.close();

	}

}
