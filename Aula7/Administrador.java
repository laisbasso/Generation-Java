package Aula7;

public class Administrador extends Empregado {
	private float ajudaDeCusto;

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public void calcularSalario() {
		float salarioLiquido = (this.getSalarioBase() - (this.getSalarioBase() * this.getImposto() / 100)) + this.getAjudaDeCusto();
		System.out.println("O salário líquido é de R$ " + df.format(salarioLiquido));
	}
	
}
