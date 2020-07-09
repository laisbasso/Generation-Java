package Aula2;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.printf("Entre com o %dº número: ", i+1);
			numeros[i] = teclado.nextInt();
		}
		
		Arrays.sort(numeros);
		
		System.out.println("Números digitados em ordem crescente:");
		for (int i = 0; i < 3; i++) {
			System.out.printf(numeros[i] + " ");
		}
	}
}