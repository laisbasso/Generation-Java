package Aula2;

import java.util.Scanner;

public class MaiorInteiro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, maior = 0;
				
		for (int i = 1; i < 4; i++) {
			System.out.printf("Digite o %dº número: ", i);
			num = teclado.nextInt();
			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.printf("O maior número digitado é %d", maior);
		
	}

}
