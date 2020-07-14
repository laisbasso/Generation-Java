package Aula7;

public class FornecedorTeste {

	public static void main(String[] args) {
		Fornecedor f = new Fornecedor();
		
		f.setNome("Francisca");
		f.setEndereco("Alameda São Vicente, 1066");
		f.setTelefone("(88) 6584-2458");
		
		f.setValorCredito(5976.18);
		f.setValorDivida(1346.85);
		
		System.out.println(f.toString());
		f.obterSaldo();
	}

}
