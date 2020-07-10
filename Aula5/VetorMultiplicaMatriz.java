package Aula5;

import java.util.Scanner;

public class VetorMultiplicaMatriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[3];
		int[][] matriz = new int[3][3];
		int x = 1;
		
		System.out.println("Preencha com as informações do vetor");
		for (int i = 0; i < 3; i++) {
			System.out.printf("Entre com o valor da %dª posição: ", x++);
			vetor[i] = teclado.nextInt();			
		}
		
		System.out.println("\nPreencha com as informações da matriz");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("Entre com o valor da posição [%d][%d]: ", l, c);
				matriz[l][c] = teclado.nextInt();		
			}
			System.out.println("");
		}
		
		for (int l = 0; l < 3; l++) {
			System.out.println("");
			for (int c = 0; c < 3; c++) {
				System.out.print(matriz[l][c] * vetor[c] + "  ");
			}
		}

	}

}
