package Aula3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, pares = 0, impares = 0;
		
		for (int i = 1; i < 11; i++) {
			System.out.printf("Entre com o %d n�mero: ", i);
			num = teclado.nextInt();
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("O total de n�meros pares digitados � de: " + pares);
		System.out.println("O total de n�meros �mpares digitados � de: " + impares);

	}

}
