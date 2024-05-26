import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente tiago = new Cliente();
        Cliente lucas = new Cliente();
        tiago.setNome("Tiago");
        lucas.setNome("Lucas");
        Conta cc = new ContaCorrente(lucas);
        Conta cp = new ContaPoupanca(tiago);

        cc.depositar(100);
        cc.transferir(cp, 50);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
