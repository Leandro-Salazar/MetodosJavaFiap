public class Clientes {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Clientes () {
    }

    public Clientes (String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public void atualizarDados() {
        System.out.println("Atualizando dados do cliente: " + nome);
    }

    public void visualizarSaldo() {
        System.out.println("Visualizando saldo do cliente: " + nome);
    }
}

