package Aula6;

import java.text.DecimalFormat;

public class Patinete {
	DecimalFormat df = new DecimalFormat("#.00");
	private int cod;
	private float taxa;
	private float precoFinal;
	private float horas;
	private int disponiveis;
	private int ocupados;

	public Patinete() {
		disponiveis = 50;
		ocupados = 0;
		taxa = 5;
	}
	
	public void usar(int c, float h) {
		if (h < 1) {
			System.out.println("Reserva m�nima de 1 hora.");		
		} else {
			cod = c;
			horas = h;
			precoFinal = (horas * taxa);
			disponiveis--;
			ocupados++;
			System.out.println("Patinete n� " + cod + " reservado com sucesso!");
			System.out.println("Total a pagar: R$" + df.format(precoFinal));
		}
	}
	
	public void devolver(int c) {
		disponiveis++;
		ocupados--;
		System.out.println("Esperamos que tenha aproveitado o passeio!");
	}
	
	public void status() {
		System.out.println("Patinetes dispon�veis: " + disponiveis + "\nPatinetes ocupados: " + ocupados);
	}

}
