package exemplos;

public class Conta {
    public Integer numero;
    public Double saldo;

    public void depositar(Double valor) {
        saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        saldo = saldo - valor;
    }

    public void transferir(Conta conta, Double valor) {
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
    }
}



