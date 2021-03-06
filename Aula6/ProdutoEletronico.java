package Aula6;

public class ProdutoEletronico {
	private int codProduto;
	private String material;
	private String cor;
	private float altura;
	private float largura;
	private float profundidade;
	private int qtdDisponivel;
	private int qtdReservada;
	private int qtdVendida;
	private int qtdVendaPontual;
	
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
			System.out.println("Quantidade indispon�vel.");
		}	
	}
	
	public void venderPE(int qtdV) {
		if (qtdReservada >= qtdV) {
			qtdVendaPontual = qtdV;
			qtdReservada -= qtdVendaPontual;
			qtdVendida += qtdVendaPontual;
		} else {
			System.out.println("Favor reservar o produto antes de finalizar a opera��o.");
		}
	}
	
	public String statusPE() {
		String mensagem = ("C�digo: " + codProduto + "\nDispon�veis: " + qtdDisponivel + "\nReservados: "
							+ qtdReservada + "\nVendidos: " + qtdVendida + "\n");
		System.out.println(mensagem);
		return mensagem;
	}

}
