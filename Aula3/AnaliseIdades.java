package Aula3;

import java.util.Scanner;

public class AnaliseIdades {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 1, menor = 0, maior = 0;
		
		while (idade != -99){
			System.out.printf("Entre com a idade: ");
			idade = teclado.nextInt();
			if (idade > 0){
				if (idade < 21){
					menor++;
				} else if (idade > 50) {
					maior++;
				}
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.printf("Total de pessoas maiores de 50 anos: " + maior);
				
	}
}