package Aula7;

public class OperarioTeste {

	public static void main(String[] args) {
		Operario o = new Operario();
		
		o.setNome("Francisca");
		o.setEndereco("Alameda São Vicente, 1066");
		o.setTelefone("(88) 6584-2458");

		o.setSalarioBase(20000f);
		o.setImposto(15);
		o.setValorVendas(100);
		o.setComissao(10);
		o.calcularSalario();
		
		System.out.println(o.toString());

	}

}
