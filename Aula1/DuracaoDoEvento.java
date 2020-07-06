package Aula1;

import java.util.Scanner;

public class DuracaoDoEvento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int segundosTotais, horas, minutos, segundos;
		
		System.out.println("Vamos calcular o tempo de duração do evento!");
		System.out.printf("Digite o tempo de duração do evento em segundos: ");
		segundosTotais = teclado.nextInt();
		horas = (segundosTotais / 3600);
		minutos = (segundosTotais % 3600) / 60;
		segundos = (segundosTotais % 3600) % 60;
		
		System.out.printf("O evento teve duração de " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).");
		

	}

}
