package br.com.algoritmo.exer04;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		//verificando se n�mero � maior que ou menor que 100
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextInt();
		
		if(num <= 100) {
			System.out.println("N�mero n�o � maior que 100");
		} else {
			System.out.println(num + " � maior que 100");
		}
		
		sc.close();
	}

}
