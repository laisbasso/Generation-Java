package Aula1;

import java.util.Scanner;

public class ClasseIdade {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anos, meses, dias, diasTotais;
		
		System.out.println("Vamos compactar sua idade em dias!");		
		System.out.println("A respeito da sua idade, digite:");		
		System.out.printf("Anos: ");	
		anos = entrada.nextInt();
		System.out.printf("Meses: ");	
		meses = entrada.nextInt();
		System.out.printf("Dias: ");
		dias = entrada.nextInt();
		
		diasTotais = (anos*365) + (meses*30) + dias;
		System.out.printf("Você já viveu por " + diasTotais + " dias.");
	}
}
