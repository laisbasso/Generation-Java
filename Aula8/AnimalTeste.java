package Aula8;

public class AnimalTeste {
	public static void main(String[] args) {
		Animal a = new Animal("Cabra", 2);
		a.emitirSom();
		a.agir();
		System.out.println("");
		
		Cachorro dog = new Cachorro("Cachorro", 5);
		dog.emitirSom();
		dog.agir();
		System.out.println("");
		
		Cavalo c = new Cavalo("Cavalo", 5);
		c.emitirSom();
		c.agir();
		System.out.println("");
		
		Preguica p = new Preguica("Preguiça", 5);
		p.emitirSom();
		p.agir();
		System.out.println("");
	}
}
