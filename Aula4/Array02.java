package Aula4;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		int[] array = new int[6];
		Scanner teclado = new Scanner(System.in);
		int somaPares = 0, totalImpares = 0; 
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("Entre com o %dº valor: ", i+1);
			array[i] = teclado.nextInt();
		}
		
		System.out.printf("\nNúmeros pares digitados: ");		
		for (int x : array) {
			if (x % 2 == 0) {
				System.out.print(x + " ");
				somaPares += x;
			}
		}
		
		System.out.println("\nSoma dos números pares: " + somaPares);
		
		System.out.printf("Números ímpares digitados: ");		
		for (int x : array) {
			if (x % 2 == 1) {
				System.out.print(x + " ");
				totalImpares++;
			}
		}
		
		System.out.println("\nQuantidade de números ímpares: " + totalImpares);	
	}
}