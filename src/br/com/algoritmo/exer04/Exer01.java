package br.com.algoritmo.exer04;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		//verificando se número é maior que ou menor que 100
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num <= 100) {
			System.out.println("Número não é maior que 100");
		} else {
			System.out.println(num + " é maior que 100");
		}
		
		sc.close();
	}

}
