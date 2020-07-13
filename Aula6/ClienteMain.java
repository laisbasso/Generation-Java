package Aula6;

public class ClienteMain {
	public static void main(String[] args) {
		Cliente c = new Cliente("Luíza", "Ferreira", 12345678900l, "Rua da Felicidade", 123, 12345678);
		c.dadosCliente();
		c.adicionarAoCarrinho(555, 2, 29.74f);
		c.finalizarCompra();
	}
}
