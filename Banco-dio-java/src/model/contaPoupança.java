package model;

public class contaPoupança extends  Conta{
    public contaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}
