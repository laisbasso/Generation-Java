package Aula6;

public class ContaBancaria {
	public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public String msg;    
    
    public ContaBancaria(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toUpperCase();
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t){
        t = t.toUpperCase();
        
        if (t == "CC" || t == "CP"){    
            int valor = (t == "CC")?50:150;
            this.setTipo(t);
            this.setStatus(true);
            this.setSaldo(valor);
            System.out.println("Conta criada com sucesso!");
        } else {
            System.out.println("Tipo inv�lido!");     
        }
    }
    
    public void fecharConta(){
        if (this.isStatus()){    
            if (this.getSaldo() > 0){
                System.out.println("Valores dispon�veis na conta, realize o saque para poder encerr�-la.");
            } else if (this.getSaldo() < 0){
                System.out.println("Valores em aberto na conta, realize o pagamento para poder encerr�-la.");
            } else {
                this.setStatus(false);
                System.out.println("Conta encerrada com sucesso!");
            }
        } else {
            System.out.println("Conta inv�lida.");
        }
    }
    
    public void depositar(float valor){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Dep�sito realizado com sucesso na conta de " + this.dono + "!");
        } else {
            System.out.println("Conta n�o est� dispon�vel.");
        }
    }
    
    public void sacar(float valor){
        if (this.isStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Valor indispon�vel para saque.");
            }
        } else {
            System.out.println("Conta indispon�vel.");
        }
    }
    
    public void pagarMensal(){
        int taxa = (this.tipo == "CC")?12:20;
        if (this.status)
            if (this.getSaldo() > taxa){
                this.setSaldo(this.getSaldo() - taxa);
                System.out.println("Taxa mensal da " + this.tipo + " debitada com sucesso.");
            } else {
                System.out.println("Valor indispon�vel para pagamento da taxa mensal.");       
        } else {
            System.out.println("Conta indispon�vel.");
        }
    }
         
    public void info(){
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Conta dispon�vel: " + this.isStatus());
    }

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
