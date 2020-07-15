package Aula8;

public class Preguica extends Animal{
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void agir() {
		System.out.println(this.getNome() + " está subindo em árvores!");
	}
}
