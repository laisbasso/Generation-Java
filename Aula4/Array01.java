package Aula4;

public class Array01 {

	public static void main(String[] args) {
		int[] A = {1, 0, 5, -2, -5, 7};	
		
		int soma = A[0] + A[1] + A[5];
		
		System.out.printf("A soma dos valores das posições "
				+ "A[0], A[1] e A[5] é igual a " + soma);
		
		A[4] = 100;
		
		System.out.println("\n\nArray atualizado:");	
		for (int i : A) {
			System.out.println(i);
		}
	
		
		

	}

}
