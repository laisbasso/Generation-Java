package Aula6;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private int codFuncionario;
	private String empresa;
	private String cargo;
	private int ramal;
	private String gestor;
	private boolean contrato;
	
	public Funcionario(String n, String s){
		nome = n;
		sobrenome = s;
	}
	
	public void admitirFuncionario(int cod, String e, String c, int r, String g) {
		codFuncionario = cod;
		empresa = e;
		cargo = c;
		ramal = r;
		gestor = g;
		contrato = true;
	}
	
	public void encerrarContrato() {
		if (contrato) {
			contrato = false;
		} else {
			System.out.println("Opera��o inv�lida!");
		}
	}
	
	public void consultaFuncionario() {
		System.out.println("Funcion�rio: " + nome + " " + sobrenome + "\nC�digo: " + codFuncionario + "\nEmpresa: " + empresa +
				"\nCargo: " + cargo + "\nRamal: " + ramal + "\nGestor: " + gestor + "\nContrato ativo? " + contrato);
	}
	
}
