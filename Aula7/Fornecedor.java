package Aula7;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public double getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo() {
		double saldo = this.getValorCredito() - this.getValorDivida();
		System.out.print("Saldo de R$ " + saldo);
	}
	
}
