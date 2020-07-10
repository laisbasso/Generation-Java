package Aula5;

public class FormulaSoma {

	public static void main(String[] args) {
		float soma = 0, numerador = 1, denominador = 1;
		
		while (numerador <= 99 && denominador <= 50) {
			soma += numerador / denominador;
			numerador+=2;
			denominador++;			
		}
		
		System.out.printf("O resultado da soma é " + soma);

	}

}
