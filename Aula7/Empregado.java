package Aula7;

import java.text.DecimalFormat;

public class Empregado extends Pessoa {
	DecimalFormat df = new DecimalFormat("#.00");
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void calcularSalario() {
		float salarioLiquido = this.getSalarioBase() - (this.getSalarioBase() * this.getImposto() / 100);
		System.out.println("O salário líquido é de R$ " + df.format(salarioLiquido));
	}
	
}
