package Aula3;

import java.util.Scanner;

public class MediaMultiplos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float media;
		int n, soma = 0, total = 0;
		
		do {
			System.out.printf("Entre com um número inteiro: ");
			n = teclado.nextInt();
			
			if (n % 3 == 0 && n != 0) {
				soma += n;
				total++;
			}
			
		} while (n != 0);
		
		media = soma / total;
		System.out.printf("A média dos números múltiplos de 3 é " + media);
	}

}
