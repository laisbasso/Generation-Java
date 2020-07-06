package Aula1;

import java.util.Scanner;

public class DescompactarIdade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int diasTotais, anos, meses, dias;
		
		System.out.println("Agora vamos descompactar sua idade!");
		System.out.printf("Digite sua idade em dias: ");
		diasTotais = teclado.nextInt();
		anos = (diasTotais / 365);
		meses = (diasTotais % 365) / 30;
		dias = (diasTotais % 30) % 30;
		
		System.out.printf("Você já viveu por " + anos + " anos, " + meses + " meses e " + dias + " dias.");
	}

}
