package Aula4;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float [][] m1 = new float[2][2];
		float [][] m2 = new float[2][2];
		
		System.out.println("Matriz 1");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("Digite o valor da posição [%d][%d]: ", l, c);
				m1[l][c] = teclado.nextFloat();
			}
		}
		
		System.out.println("\nMatriz 2");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("Digite o valor da posição [%d][%d]: ", l, c);
				m2[l][c] = teclado.nextFloat();
			}
		}
		
		System.out.println("\nLista de opções");		
		System.out.println("[1] para somar as duas matrizes");		
		System.out.println("[2] para subtrair a primeira matriz da segunda");			
		System.out.println("[3] para adicionar uma constante as duas matrizes");			
		System.out.println("[4] para imprimir as matrizes");
		System.out.printf("\nEntre com a opção escolhida: ");	
		int opcao = teclado.nextInt();
		
		switch(opcao) {
		
		case 1:
			
			float[][] soma = new float[2][2];
			
			for (int l = 0; l < 2; l++) {
				System.out.println("");
				for (int c = 0; c < 2; c++) {
					soma[l][c] = m1[l][c] + m2[l][c];
					System.out.print(soma[l][c] + "  ");
				}
			}			
			break;
			
		case 2:
			
			float[][] sub = new float[2][2];
			
			for (int l = 0; l < 2; l++) {
				System.out.println("");
				for (int c = 0; c < 2; c++) {
					sub[l][c] = m1[l][c] - m2[l][c];
					System.out.printf(sub[l][c] + "  ");
				}
			}		
			break;
			
		case 3:
			
			System.out.printf("Entre com o valor da constante: ");
			final float valor = teclado.nextFloat();
			
			System.out.println("\nMatriz 1");
			for (int l = 0; l < 2; l++) {
				System.out.println("");
				for (int c = 0; c < 2; c++) {
					m1[l][c] += valor;
					System.out.printf(m1[l][c] + "  ");
				}
			}
			
			System.out.println("\n\nMatriz 2");
			for (int l = 0; l < 2; l++) {
				System.out.println("");
				for (int c = 0; c < 2; c++) {
					m2[l][c] += valor;
					System.out.printf(m2[l][c] + "  ");
				}
			}			
			break;
			
		case 4:
			
			System.out.println("\nMatriz 1");
			for (int l = 0; l < 2; l++) {
				System.out.println("");
				for (int c = 0; c < 2; c++) {
					System.out.printf(m1[l][c] + "  ");
				}
			}
			
			System.out.println("\n\nMatriz 2");
			for (int l = 0; l < 2; l++) {
				System.out.println("");
				for (int c = 0; c < 2; c++) {
					System.out.printf(m2[l][c] + "  ");
				}
			}				
			break;
			
		}
		
	}

}
