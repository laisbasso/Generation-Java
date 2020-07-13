package Aula6;

public class Paciente {
	String nome;
	String sobrenome;
	int idade;
	String convenio;
	String tipoSanguineo;
	String medico;
	String especialidade;
	boolean prioridade;
	String sintomas;
	boolean marcouConsulta;
	boolean passouTriagem;
	
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
				"\nIdade: " + idade + " anos \nTipo sanguíneo: " + tipoSanguineo);
		if (passouTriagem) {
			System.out.println("--- URGÊNCIA? " + prioridade + " ---\nSintomas: " + sintomas);
		}
		
		if (marcouConsulta) {
			System.out.println("Convênio: " + convenio + "\nMédico: " + medico + "\nEspecialidade: " + especialidade);
		}
	}

}
