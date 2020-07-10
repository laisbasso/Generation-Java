package Aula5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CondicaoDePagamento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		float precoEtiqueta, precoFinal;
		int opcao, parcelas;
		
		System.out.printf("Entre com o valor de etiqueta do produto: ");
		precoEtiqueta = teclado.nextInt();
		System.out.println("\nEscolha a condição de pagamento");
		System.out.println("\n[1] À vista em dinheiro ou cheque, recebe 20% de desconto");
		System.out.println("[2] À vista no cartão de crédito, recebe 15% de desconto");
		System.out.println("[3] Em duas vezes, preço normal de etiqueta sem juros");
		System.out.println("[4] Em três vezes, preço normal de etiqueta mais juros de 10%");
		System.out.printf("\nDigite a opção escolhida: ");
		opcao = teclado.nextInt();
		
		switch (opcao){
			
		case 1:	
			precoFinal = (precoEtiqueta * 80) / 100;
			System.out.printf("\nO valor final é de R$ " + df.format(precoFinal));		
			break;
			
		case 2:			
			precoFinal = (precoEtiqueta * 85) / 100;
			System.out.printf("\nO valor final é de R$ " + df.format(precoFinal));
			break;
			
		case 3:
			parcelas = 2;
			precoFinal = (precoEtiqueta / parcelas);
			System.out.printf("\nO valor final é de " + parcelas + " parcelas de R$ " + df.format(precoFinal) + " cada.");
			break;
			
		case 4:
			parcelas = 3;
			precoFinal = ((precoEtiqueta * 110 / 100) / parcelas);
			System.out.printf("\nO valor final é de " + parcelas + " parcelas de R$ " + df.format(precoFinal) + " cada.");
			break;
			
		default:
			System.out.printf("\nOpção inválida!");
			
		}
		
	}
	
}
