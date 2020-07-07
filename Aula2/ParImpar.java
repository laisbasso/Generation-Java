package Aula2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.printf("Digite um número inteiro: ");
		int num = teclado.nextInt();
	
		if (num % 2 == 0) {
			System.out.println("Número par");
			System.out.printf("Sua raíz quadrada é " + df.format(Math.sqrt(num)));
		} else {
			System.out.println("Número ímpar");
			System.out.printf("Seu número elevado ao quadrado é " + Math.pow(num, 2));
		}
		
	}

}
