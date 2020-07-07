package Aula2;

import java.util.Scanner;

public class FaixaDeIdade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Entre com sua idade: ");
		int idade = teclado.nextInt();
		
		if (idade < 10 || idade > 25) {
			System.out.printf("Idade inválida!");
		} else if (idade >= 10 && idade <= 14) {
			System.out.printf("Infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.printf("Juvenil");
		} else {
			System.out.printf("Adulto");
		}

	}

}
