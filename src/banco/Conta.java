package banco;

public class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public void sacar(double valor){
        saldo -= valor;
    };
    public void depositar(double valor){
        saldo += valor;
    };
    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    };

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public void imprimirExtrato(){
        System.out.println("TITULAR: " + this.cliente.getNome());
        System.out.println("AGENCIA: " + this.agencia);
        System.out.println("NUMERO DA CONTA: " + this.numero);
        System.out.println("SALDO ATUAL: " + this.saldo);
    }

}
