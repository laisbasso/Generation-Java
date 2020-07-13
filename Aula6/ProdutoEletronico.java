package Aula6;

public class ProdutoEletronico {
	int codProduto;
	String material;
	String cor;
	float altura;
	float largura;
	float profundidade;
	int qtdDisponivel;
	int qtdReservada;
	int qtdVendida;
	int qtdVendaPontual;
	
	public ProdutoEletronico(int cP, String mat, String c, float alt, float larg, float prof, int qtdD) {
		codProduto = cP;
		material = mat;
		cor = c;
		altura = alt;
		largura = larg;
		profundidade = prof;
		qtdDisponivel = qtdD;
		qtdReservada = 0;
		qtdVendida = 0;
	}
	
	public void reservarPE (int qtdR) {
		if (qtdDisponivel >= qtdR) {
			qtdReservada = qtdR;
			qtdDisponivel -= qtdReservada;
		} else {
			System.out.println("Quantidade indisponível.");
		}	
	}
	
	public void venderPE(int qtdV) {
		if (qtdReservada >= qtdV) {
			qtdVendaPontual = qtdV;
			qtdReservada -= qtdVendaPontual;
			qtdVendida += qtdVendaPontual;
		} else {
			System.out.println("Favor reservar o produto antes de finalizar a operação.");
		}
	}
	
	public String statusPE() {
		String mensagem = ("Código: " + codProduto + "\nDisponíveis: " + qtdDisponivel + "\nReservados: "
							+ qtdReservada + "\nVendidos: " + qtdVendida + "\n");
		System.out.println(mensagem);
		return mensagem;
	}

}
