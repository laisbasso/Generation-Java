package Aula3;

import java.util.Scanner;

public class CaracteristicasPsicologicas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 0, idade, sexo, opcao, totalCalmos = 0, mulheresNervosas = 0,
				homensAgressivos = 0, nervososMaiores40 = 0, calmosMenores18 = 0;
				
		while (i < 150) {
			i++;
			System.out.printf("\nEntre com sua idade: ");
			idade = teclado.nextInt();
			System.out.printf("\nDigite 1 para feminino ou 2 para masculino: ");
			sexo = teclado.nextInt();
			System.out.println("\nEntre com sua característica");
			System.out.println("1 para calmo/a");
			System.out.println("2 para nervoso/a");
			System.out.println("3 para agressivo/a");
			opcao = teclado.nextInt();
			
			if (opcao == 1) {
				totalCalmos++;
			}		
			if (sexo == 1 && opcao == 2) {
				mulheresNervosas++;
			}
			if (sexo == 2 && opcao == 3) {
				homensAgressivos++;
			}			
			if (opcao == 2 && idade > 40) {
				nervososMaiores40++;
			}			
			if (opcao == 1 && idade < 18) {
				calmosMenores18++;
			}		
		}
		
		System.out.println("\nResultado da pesquisa \n");
		System.out.println("Total de pessoas calmas: " + totalCalmos);
		System.out.println("Total de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Total de homens agressivos: " + homensAgressivos);
		System.out.println("Total de pessoas nervosas com mais de 40 anos: " + nervososMaiores40);
		System.out.println("Total de pessoas calmas com menos de 18 anos: " + calmosMenores18);

	}

}