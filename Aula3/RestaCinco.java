package Aula3;

public class RestaCinco {

	public static void main(String[] args) {		
		for (int i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				System.out.printf(i + " ");
			}
		}

	}
}
