public class Conta {

    private String numeroConta;
    private double saldo;
    private Clientes cliente;

    public Conta() {
    }

    public Conta(String numeroConta, double saldo, Clientes cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        System.out.println("Depositando valor: " + valor + " na conta: " + numeroConta);
    }

    public void sacar(double valor) {
        System.out.println("Sacando valor: " + valor + " da conta: " + numeroConta);
    }

    public void transferir(double valor, Conta contaDestino) {
        System.out.println("Transferindo valor: " + valor + " da conta: " + numeroConta + " para a conta: " + contaDestino.numeroConta);
    }
}