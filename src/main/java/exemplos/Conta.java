package exemplos;

public class Conta {
    private Integer numero;
    private Double saldo;
    private Double limite = 1000d;

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void depositar(Double valor) {
        if (valor < 0) {
            throw new RuntimeException("Não é possível depositar valores negativos");
        }
        saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        if (valor > saldo + limite) {
            throw new RuntimeException("Atingido limite de saldo");
        }
        if (valor < 0) {
            throw new RuntimeException("Não é possível sacar valores negativos");
        }
        saldo = saldo - valor;
    }

    public void transferir(Conta conta, Double valor) {
        this.sacar(valor);
        conta.depositar(valor);
    }
}



