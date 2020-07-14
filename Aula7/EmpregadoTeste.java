package Aula7;

public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e = new Empregado();
		
		e.setNome("Francisca");
		e.setEndereco("Alameda São Vicente, 1066");
		e.setTelefone("(88) 6584-2458");
		
		e.setSalarioBase(20000f);
		e.setImposto(15);
		e.calcularSalario();
		
		System.out.println(e.toString());
			
		
	}
}
