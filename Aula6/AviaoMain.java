package Aula6;

public class AviaoMain {
	public static void main(String[] args) {
		Aviao a = new Aviao("LATAM", "BA-5678", 336);
		a.criarRota("S�o Paulo", "T�quio", true, 78);
		a.statusViagem();
	}
}
