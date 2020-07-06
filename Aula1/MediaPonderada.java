package Aula1;

import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float n1, n2, n3, media;
		
		System.out.printf("Digite a primeira nota: ");
		n1 = teclado.nextFloat();
		System.out.printf("Digite a segunda nota: ");
		n2 = teclado.nextFloat();
		System.out.printf("Digite a terceira nota: ");
		n3 = teclado.nextFloat();
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		
		System.out.printf("A média final do aluno é de " + media);		
	}
}
