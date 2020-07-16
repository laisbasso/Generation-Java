package Aula7;

public class Operario extends Empregado {
	private float valorVendas;
	private float comissao;
	
	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = (comissao * this.getValorVendas()) / 100;
	}

	@Override
	public void calcularSalario() {
		float salarioLiquido = this.getSalarioBase() - (this.getSalarioBase() * this.getImposto() / 100) + this.getComissao();
		System.out.println("O salário líquido é de R$ " + df.format(salarioLiquido));
	}
}
