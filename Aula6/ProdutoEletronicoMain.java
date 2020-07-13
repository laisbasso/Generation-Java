package Aula6;

public class ProdutoEletronicoMain {
	public static void main(String[] args) {
		ProdutoEletronico p = new ProdutoEletronico(564, "Poliuretano", "Grafite", 25f, 12.8f, 3.5f, 220);
		p.statusPE();
		p.reservarPE(5);
		p.statusPE();
		p.venderPE(6);
		p.statusPE();
	}
}
