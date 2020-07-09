package Aula4;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		int[][] array = new int[3][3];
		int maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("Digite o valor da posição [%d][%d]: ",  l, c);
				array[l][c] = teclado.nextInt();
				
				if (array[l][c] > 10) {
					maior++;
				}
			}
		}
		System.out.printf("A matriz possui %d elemento(s) maiores que 10.", maior);	
	}
}
