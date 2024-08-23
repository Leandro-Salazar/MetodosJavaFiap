# MetodosJavaFiap

Este repositório contém um projeto Java que implementa as principais classes e métodos para um sistema Fintech. O projeto foi desenvolvido como parte de um desafio da FIAP e inclui as seguintes classes:

## Classes Implementadas

### 1. `Cliente`
Representa um cliente do sistema Fintech. Possui atributos como nome, CPF, email e telefone.

#### Principais métodos:
- `atualizarDados()`: Atualiza os dados do cliente.
- `visualizarSaldo()`: Visualiza o saldo do cliente.

### 2. `Conta`
Representa uma conta bancária associada a um cliente. Possui atributos como número da conta, saldo e cliente associado.

#### Principais métodos:
- `depositar(double valor)`: Deposita um valor na conta.
- `sacar(double valor)`: Saca um valor da conta.
- `transferir(double valor, Conta contaDestino)`: Transfere um valor para outra conta.

### 3. `Transacao`
Representa uma transação financeira realizada entre contas. Possui atributos como ID da transação, valor, data, conta de origem e conta de destino.

#### Principais métodos:
- `registrarTransacao()`: Registra uma transação.
- `exibirDetalhes()`: Exibe os detalhes da transação.

### 4. `CartaoCredito`
Representa um cartão de crédito associado a uma conta. Possui atributos como número do cartão, limite, saldo utilizado e data de validade.

#### Principais métodos:
- `realizarCompra(double valor)`: Realiza uma compra utilizando o cartão.
- `pagarFatura(double valor)`: Paga a fatura do cartão.
- `consultarLimite()`: Consulta o limite disponível no cartão.
