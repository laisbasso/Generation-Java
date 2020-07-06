package Aula1;

import java.util.Scanner;

public class DevolveXeY {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;
		
		System.out.printf("Digite o valor de A: ");
		a = teclado.nextInt();
		System.out.printf("Digite o valor de B: ");
		b = teclado.nextInt();
		System.out.printf("Digite o valor de C: ");
		c = teclado.nextInt();
		System.out.printf("Digite o valor de D: ");
		d = teclado.nextInt();
		System.out.printf("Digite o valor de E: ");
		e = teclado.nextInt();
		System.out.printf("Digite o valor de F: ");
		f = teclado.nextInt();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("\nO valor de x é " + x);
		System.out.println("O valor de y é " + y);
	}
}
