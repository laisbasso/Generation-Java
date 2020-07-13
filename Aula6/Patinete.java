package Aula6;

import java.text.DecimalFormat;

public class Patinete {
	DecimalFormat df = new DecimalFormat("#.00");
	int cod;
	float taxa;
	float precoFinal;
	float horas;
	int disponiveis;
	int ocupados;

	public Patinete() {
		disponiveis = 50;
		ocupados = 0;
		taxa = 5;
	}
	
	public float usar(int c, float h) {
		if (h < 1) {
			System.out.println("Reserva mínima de 1 hora.");		
		} else {
			cod = c;
			horas = h;
			precoFinal = (horas * taxa);
			disponiveis--;
			ocupados++;
			System.out.println("Patinete nº " + cod + " reservado com sucesso!");
			System.out.println("Total a pagar: R$" + df.format(precoFinal));
		}
		return precoFinal;
	}
	
	public void devolver(int c) {
		disponiveis++;
		ocupados--;
		System.out.println("Esperamos que tenha aproveitado o passeio!");
	}
	
	public void status() {
		System.out.println("Patinetes disponíveis: " + disponiveis + "\nPatinetes ocupados: " + ocupados);
	}
	
	public static void main(String[] args) {
		Patinete p = new Patinete();
		p.usar(15468, 1.5f);
		p.status();
		p.devolver(15468);
		p.status();
	}

}
