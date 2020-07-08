package Aula3;

import java.util.Scanner;

public class SomaDigitos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, soma = 0;
		
		do {
			System.out.printf("Entre com um número: ");
			n = teclado.nextInt();
			soma += n;
		} while (n != 0);

		System.out.printf("A soma dos números digitados é " + soma);
		
	}

}
