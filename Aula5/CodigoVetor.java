package Aula5;

import java.util.Scanner;

public class CodigoVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float vetor[] = new float[5];
		int cod, c = 1;
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Entre com o %dº valor do vetor: ", c++);
			vetor[i] = teclado.nextFloat();
		}
		
		System.out.println("\nCódigos disponíveis:");		
		System.out.println("[0] para finalizar");		
		System.out.println("[1] para exibir vetor na ordem direta");		
		System.out.println("[2] para exibir vetor na ordem inversa");
		System.out.printf("\nEntre com o código escolhido: ");
		cod = teclado.nextInt();
		
		if (cod < 0 || cod > 2) {
			System.out.printf("Código inválido!");
		} else if (cod == 1) {
			for (int i = 0; i < 5; i++) {
				System.out.printf(vetor[i] + "  ");
			}
		} else if (cod == 2) {
			for (int i = 4; i >= 0; i--) {
				System.out.printf(vetor[i] + "  ");
			}
		}	
		
	}

}
