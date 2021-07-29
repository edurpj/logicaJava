package br.com.algoritmo.exer03;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		//Calcular a média
		
		int num1, num2, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade mínima: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite a quantidade máxima: ");
		num2 = sc.nextInt();
		
		media = (num1 + num2) / 2;
		
		System.out.println("Media igual: " + media);
		
		sc.close();

	}

}
