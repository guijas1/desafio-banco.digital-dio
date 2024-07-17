package model;

public abstract class Conta {

    private static int sequencial = 1;
    private int num;
    private double saldo;
    private Cliente clinte;

    public Conta(Cliente cliente){
        this.num = sequencial++;
        this.clinte = cliente;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNum(){
        return num;
    }

    public Cliente getCliente(){
        return clinte;
    }

    public void imprimirExtrato(){
        System.out.println(String.format("Titular: %s", this.clinte.getNome()));
        System.out.println(String.format("Número da Conta: %d", this.num));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
