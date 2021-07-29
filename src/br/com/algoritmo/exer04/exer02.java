package br.com.algoritmo.exer04;

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		
		//Verificando se o número é positivo ou negativo
		
		int num, a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num < 0) {
			a = num;
			System.out.println(a);
		}else {
			b = num;
			System.out.println(b);
		}
		
		sc.close();
	}

}
