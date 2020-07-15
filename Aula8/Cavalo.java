package Aula8;

public class Cavalo extends Animal{
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println(this.getNome() + " está relinchando!");
	}
}
