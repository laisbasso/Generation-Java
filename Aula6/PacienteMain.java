package Aula6;

public class PacienteMain {
	public static void main(String[] args) {
		Paciente p = new Paciente("Joana", "Alves", 52, "A+");
		p.triagem(true, "Ansiedade");
		p.marcarConsulta("Amil", "Flávia Rocha", "Psicoterapia Cognitiva Comportamental");
		p.statusPaciente();
	}
}
