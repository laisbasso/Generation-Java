package Aula5;

import java.util.Scanner;

public class FaixaDeNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0, faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, c = 1;
		
		System.out.println("Vamos analisar alguns n�meros!");		
		System.out.println("\nDigite um n�mero negativo para sair do programa e exibir o resultados.");		
		
		while (n >= 0) {
			System.out.printf("Digite o %d� n�mero: ", c++);
			n = teclado.nextInt();
			
			if (n < 0) {
				break;
			} else if (n >= 0 && n <= 25) {
				faixa1++;
			} else if (n >= 26 && n <= 50) {
				faixa2++;
			} else if (n >= 51 && n <= 75) {
				faixa3++;
			} else if (n >= 76 && n <= 100) {
				faixa4++;
			}
		}

		System.out.println("\nResultados");
		System.out.printf("Foram digitados:");
		System.out.printf("\n%d n�meros entre 0 e 25", faixa1);
		System.out.printf("\n%d n�meros entre 26 e 50", faixa2);
		System.out.printf("\n%d n�meros entre 51 e 75", faixa3);
		System.out.printf("\n%d n�meros entre 76 e 100", faixa4);
				
	}

}
