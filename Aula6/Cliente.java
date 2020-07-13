package Aula6;

public class Cliente {
	private String nome;
	private String sobrenome;
	private long cpf;
	private String endereco;
	private int numCasa;
	private int cep;
	private int qtdProduto;
	private float valorProduto;
	private float totalCompra;
	
	public Cliente(String n, String s, long nCpf, String end, int nCasa, int nCep) {
		nome = n;
		sobrenome = s;
		cpf = nCpf;
		endereco = end;
		numCasa = nCasa;
		cep = nCep;			
	}
	
	public void dadosCliente() {
		System.out.println("Cliente: " + nome + " " + sobrenome + "\nCPF: " + cpf + "\nEndereço: "
							+ endereco + "\nNº: " + numCasa + "\nCEP: " + cep);
	}
	
	public void adicionarAoCarrinho(int qtdP, float valorP) {
		qtdProduto = qtdP;
		valorProduto = valorP;	
		System.out.println("Adicionado com sucesso!");
	}
	
	public void finalizarCompra() {
		totalCompra = (qtdProduto * valorProduto);
		System.out.println("O valor total da compra é R$" + totalCompra);
	}
	
}
