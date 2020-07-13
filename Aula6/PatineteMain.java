package Aula6;

public class PatineteMain {
	public static void main(String[] args) {
		Patinete p = new Patinete();
		p.usar(15468, 1.5f);
		p.status();
		p.devolver(15468);
		p.status();
	}
}
