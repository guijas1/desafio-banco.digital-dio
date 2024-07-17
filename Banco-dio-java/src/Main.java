import model.*;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Meu Banco");

        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new contaPoupança(cliente2);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(2000);

        contaCorrente.transferir(300, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }


}
