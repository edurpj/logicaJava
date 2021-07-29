package br.com.algoritmo.exer04;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		//Verificando se número é par ou impar
		
		int num, p, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			p = num;
			System.out.println("Número par " + p);
		} else {
			i = num;
			System.out.println("Número impar " + i);
		}
		
		
		sc.close();
	}

}
