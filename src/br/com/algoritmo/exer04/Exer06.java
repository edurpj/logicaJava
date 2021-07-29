package br.com.algoritmo.exer04;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		//Calcular salario(R$10,00/h) se tiver extra calcular(R$ 20,00/hora extra) 
		
		float n, sal, valorH = 10;
		int e = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as horas trabalhadas");
		n = sc.nextFloat();
		
		if(n > 50) {
			e = (int) (n - 50) * 20;
			sal = (50 * valorH) + e;
			
			System.out.println("salario: " + sal);
			System.out.println("Extra: " + e);
		}else {
			sal = n * 10;
			System.err.println("Salario: " + sal);		
			
		
		}
		
		
		
		sc.close();
	}

}
