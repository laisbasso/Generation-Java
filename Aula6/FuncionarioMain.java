package Aula6;

public class FuncionarioMain {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Alexandre", "Silveira");
		f.admitirFuncionario(15975, "Facebook", "Tech Lead", 9456, "Bárbara Farias");
		f.encerrarContrato();
		f.consultaFuncionario();
	}
}
