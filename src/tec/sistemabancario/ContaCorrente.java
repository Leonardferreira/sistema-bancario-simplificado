package tec.sistemabancario;

public class ContaCorrente {
    private String cpf;
    private String nomeCompleto;
    private double saldo;

    public ContaCorrente(String cpf, String nomeCompleto) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.saldo = 0;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public double verSaldo() {
        System.out.println("Conta: " + nomeCompleto);
        System.out.println("Saldo da conta R$: " + this.saldo);
        System.out.println("========================================");
        return this.saldo;
    }

    public void sacar(double valor) {
        // Verifica se o valor do saque não é negativo.
        if (valor <= 0) {
            System.out.println("O valor de saque deve ser maior que R$0,00");
            return;
        }
        // verificar se há saldo suficiente para o valor solicitado
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual: R$ " + this.saldo);
            System.out.println("Valor do saque: R$ "+ valor);
            System.out.println("=================================");
        } else {
            // Realizar o saque subtraindo do  valor
            this.saldo -= valor;
            System.out.println("Valor do saque: R$ "+ valor);
            System.out.println("Conta: " + nomeCompleto);
            System.out.println("Saque de R$ " + valor + " \nrealizado com sucesso.");
            System.out.println("Saldo atualizado: R$ " + this.saldo);
            System.out.println("======================================");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor de deposito deve ser maior que R$0,00");
            return;
        } else {
            this.saldo += valor;
            System.out.println("Conta: " + nomeCompleto);
            System.out.println("Deposito no valor de R$ " + valor);
            System.out.println("Saldo atualizado: R$ " + this.saldo);
            System.out.println("=================================");
        }

    }
    public void transferir(double valor, ContaCorrente contaDestino) {
        if (valor <= 0) {
            System.out.println("O Valor da transferêncai deve ser maior que R$ 0,00");
            return;
        }
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -=valor;
            contaDestino.saldo +=valor;
            System.out.println("========================================");
            System.out.println("          TRANSFERÊNCIA BANCÁRIA        ");
            System.out.println("========================================");
            System.out.println("De: " + this.nomeCompleto);
            System.out.println("Para: " + contaDestino.nomeCompleto);
            System.out.println("Valor transferido: R$ " + valor);
            System.out.println("Seu novo saldo: R$ " + this.saldo);
            System.out.println("========================================");
        }

    }
}
