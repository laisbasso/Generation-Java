package Aula6;

public class AviaoMain {
	public static void main(String[] args) {
		Aviao a = new Aviao("LATAM", "BA-5678", 336);
		a.criarRota("São Paulo", "Tóquio", true, 78);
		a.statusViagem();
	}
}
