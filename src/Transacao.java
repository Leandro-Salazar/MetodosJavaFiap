public class Transacao {

    private String idTransacao;
    private double valor;
    private String data;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transacao() {
    }

    public Transacao(String idTransacao, double valor, String data, Conta contaOrigem, Conta contaDestino) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.data = data;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void registrarTransacao() {
        System.out.println("Registrando transação de valor: " + valor + " na data: " + data);
    }

    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes da transação: " + idTransacao);
    }
}

