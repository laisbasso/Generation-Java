package Aula7;

public class AdministradorTeste {
	
	public static void main(String[] args) {
		Administrador a = new Administrador();
		
		a.setNome("Francisca");
		a.setEndereco("Alameda São Vicente, 1066");
		a.setTelefone("(88) 6584-2458");

		a.setSalarioBase(20000f);
		a.setImposto(15);
		a.setAjudaDeCusto(350f);
		a.calcularSalario();
		
		System.out.println(a.toString());
		
	}
}
