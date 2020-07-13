package Aula6;

public class ContaBancariaMain {
    public static void main(String[] args) {
    	ContaBancaria c = new ContaBancaria();
        c.setNumConta(111);
        c.setDono("Marcos");
        c.abrirConta("CC");
        c.depositar(100);
        c.sacar(150);
        c.fecharConta();
        c.info();
    }
}
