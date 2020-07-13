package Aula6;

public class Paciente {
	private String nome;
	private String sobrenome;
	private int idade;
	private String convenio;
	private String tipoSanguineo;
	private String medico;
	private String especialidade;
	private boolean prioridade;
	private String sintomas;
	private boolean marcouConsulta;
	private boolean passouTriagem;
	
	public Paciente(String n, String s, int i, String tS) {
		nome = n;
		sobrenome = s;
		idade = i;
		tipoSanguineo = tS;
		passouTriagem = false;
		marcouConsulta = false;
	}
	
	public void triagem(boolean p, String sint) {
		prioridade = p;
		sintomas = sint;
		passouTriagem = true;
	}
	
	public void marcarConsulta(String c, String m, String e) {
		convenio = c;
		medico = m;
		especialidade = e;
		marcouConsulta = true;
	}
	
	public void statusPaciente() {
		System.out.println("Paciente: " + nome + " " + sobrenome +
				"\nIdade: " + idade + " anos \nTipo sangu�neo: " + tipoSanguineo);
		if (passouTriagem) {
			System.out.println("--- URG�NCIA? " + prioridade + " ---\nSintomas: " + sintomas);
		}
		
		if (marcouConsulta) {
			System.out.println("Conv�nio: " + convenio + "\nM�dico: " + medico + "\nEspecialidade: " + especialidade);
		}
	}

}
