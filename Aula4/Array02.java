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
			
			if (array[i] % 2 == 0){
				somaPares += array[i];
			} else {
				totalImpares++;
			}
		}
		
		System.out.printf("\nNúmeros pares digitados: ");		
		for (int i : array) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}
		
		System.out.println("\bSoma dos números pares: " + somaPares);
		
		System.out.printf("Números ímpares digitados: ");		
		for (int i : array) {
			if (i % 2 == 1) {
				System.out.print(i);
			}
		}
		
		System.out.println("\nQuantidade de números ímpares: " + totalImpares);	
	}
}
