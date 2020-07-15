package Aula8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Estoque {
	public static void main (String args[])
	{
		Scanner teclado = new Scanner(System.in);
		Collection<String> dados = new ArrayList<String>();
		int opcao;
		String info;
		
		do { 
			System.out.println("--- MENU ---");		
			System.out.println("[1] para armazenar dados");		
			System.out.println("[2] para remover dados");		
			System.out.println("[3] para atualizar dados");		
			System.out.println("[4] para apresentar dados");	
			System.out.println("[5] para fechar o programa");
			System.out.printf("Entre com a opção escolhida: ");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.printf("Entre com a nova informação da lista: ");
				info = teclado.next();
				dados.add(info);
				break;
				
			case 2:
				System.out.printf("Entre com a informação que deseja remover da lista: ");
				info = teclado.next();
				dados.remove(info);
				break;
				
			case 3:
				System.out.printf("Entre com a informação que deseja atualizar: ");
				info = teclado.next();
				dados.remove(info);
				System.out.printf("Entre com a nova informação da lista: ");
				info = teclado.next();
				dados.add(info);
				break;
				
			case 4:
				for (String d: dados) {
					System.out.println(d);
				}
				break;
			}
			
			System.out.println();
			
		} while (opcao != 5);
		
	}
}