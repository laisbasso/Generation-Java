package Aula6;

public class Aviao {
	private String empresa;
	private String codAviao;
	private int numPassageiros;
	private String endPartida;
	private String endDestino;
	private boolean escala;
	private int vagas;
	
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
