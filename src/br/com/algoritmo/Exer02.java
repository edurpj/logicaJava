package br.com.algoritmo;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		//Receber 2 n�meros e multiplicar o resultado pelo segundo
		
		int num1 ,num2, soma, mult;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		mult = soma * num2;
		
		System.out.println("Resultado = " + mult);
		
		
		
		sc.close();

	}

}
