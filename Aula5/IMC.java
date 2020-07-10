package Aula5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		float peso, altura;
		double imc;
		
		System.out.println("Vamos calcular seu Índice de Massa Corporal!");
		System.out.printf("Entre com seu peso: ");
		peso = teclado.nextFloat();
		System.out.printf("Entre com sua altura: ");
		altura = teclado.nextFloat();
	
		imc = peso / (Math.pow(altura, 2));	
		System.out.printf("Seu IMC é de " + df.format(imc) + " e você está ");	
		
		if (imc < 18.5) {
			System.out.printf("abaixo do peso.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.printf("com peso normal.");
		} else if (imc >= 25 && imc < 30) {
			System.out.printf("acima do peso.");
		} else {
			System.out.printf("obeso.");
		}
		
	}
	
}
