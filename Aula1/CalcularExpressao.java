package Aula1;

import java.util.Scanner;

public class CalcularExpressao {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A, B, C;
		double D, R, S;
		
		System.out.printf("Digite o valor de A: ");
		A = teclado.nextInt();
		System.out.printf("Digite o valor de B: ");
		B = teclado.nextInt();
		System.out.printf("Digite o valor de C: ");
		C = teclado.nextInt();
		R = Math.pow((A + B),2);
		S = Math.pow((B + C),2);
		D = (R + S)/2;
		
		System.out.printf("O valor de D é " + D);
	}
}
