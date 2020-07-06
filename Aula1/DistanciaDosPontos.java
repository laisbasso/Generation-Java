package Aula1;

import java.util.Scanner;

public class DistanciaDosPontos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		
		System.out.println("Preencha as coordenadas do Ponto 1:");
		System.out.printf("x1: ");
		x1 = teclado.nextInt();
		System.out.printf("y1: ");
		y1 = teclado.nextInt();
		System.out.println("Preencha as coordenadas do Ponto 2:");
		System.out.printf("x2: ");
		x2 = teclado.nextInt();
		System.out.printf("y2: ");
		y2 = teclado.nextInt();
		
		d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.printf("A distância entre os dois pontos é de " + d);
		
	}
}