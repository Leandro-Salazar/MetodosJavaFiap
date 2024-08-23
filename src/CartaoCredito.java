public class CartaoCredito {

    private String numeroCartao;
    private double limite;
    private double saldoUtilizado;
    private String dataValidade;

    public CartaoCredito() {
    }


    public CartaoCredito(String numeroCartao, double limite, double saldoUtilizado, String dataValidade) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
        this.dataValidade = dataValidade;
    }


    public void realizarCompra(double valor) {
        System.out.println("Realizando compra de valor: " + valor + " no cartão: " + numeroCartao);
    }

    public void pagarFatura(double valor) {
        System.out.println("Pagando fatura de valor: " + valor + " no cartão: " + numeroCartao);
    }

    public void consultarLimite() {
        System.out.println("Consultando limite disponível no cartão: " + numeroCartao);
    }
}
