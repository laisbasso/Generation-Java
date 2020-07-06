package Aula1;

import java.util.Scanner;

public class CustoDoCarro {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float custoConsumidor, custoFabrica;
		
		System.out.printf("Digite o custo de fábrica do carro: R$ ");
		custoFabrica = teclado.nextInt();
		
		custoConsumidor = custoFabrica + ((custoFabrica * 73) / 100);
		System.out.printf("O custo do carro ao consumidor é de R$ " + custoConsumidor);
	}
}
