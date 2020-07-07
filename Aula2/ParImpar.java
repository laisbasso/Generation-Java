package Aula2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.printf("Digite um n�mero inteiro: ");
		int num = teclado.nextInt();
	
		if (num % 2 == 0) {
			System.out.println("N�mero par");
			System.out.printf("Sua ra�z quadrada � " + df.format(Math.sqrt(num)));
		} else {
			System.out.println("N�mero �mpar");
			System.out.printf("Seu n�mero elevado ao quadrado � " + Math.pow(num, 2));
		}
		
	}

}
