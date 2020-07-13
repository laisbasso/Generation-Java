package Aula6;

public class Aviao {
	String empresa;
	String codAviao;
	int numPassageiros;
	String endPartida;
	String endDestino;
	boolean escala;
	int vagas;
	
	public Aviao(String emp, String codA, int nPas) {
		empresa = emp;
		codAviao = codA;
		nPas = numPassageiros;
	}
	
	public void criarRota(String ePar, String eDes, boolean esc, int v) {
		endPartida = ePar;
		endDestino = eDes;
		escala = esc;
		vagas = v;
	}
	
	public void statusViagem() {
		System.out.println("Avião " + codAviao + " pertencente a " + empresa + " possui " + vagas +
				" assentos livres para a rota de " + endPartida + " até " + endDestino + ".\nPossui escala? " + escala);				
	}

}
