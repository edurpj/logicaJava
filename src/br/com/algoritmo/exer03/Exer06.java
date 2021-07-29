package br.com.algoritmo.exer03;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		int hora;
		float salaH, salaT;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Horas trabalhadas: ");
		hora = sc.nextInt();
		
		System.out.println("Digite o valor por hora: ");
		salaH = sc.nextFloat();
		
		salaT = hora * salaH;
		
		System.out.println("Salário total: " + salaT);
		
		sc.close();
	}

}
