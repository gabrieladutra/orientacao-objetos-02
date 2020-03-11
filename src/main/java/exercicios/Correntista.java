package exercicios;

public class Correntista {
  private Integer numero;
  private Integer agencia;
  private Double saldo;

  public Correntista(Integer numero, Integer agencia, Double saldo) {
    this.numero = numero;
    this.agencia = agencia;
    this.saldo = saldo;
  }

  public Integer getNumero() {
    return numero;
  }

  public Integer getAgencia() {
    return agencia;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public void sacar(Double valor) {
    if (saldo < valor) {
      throw new RuntimeException("Saldo insuficiente");
    }
    saldo -= valor;
  }

  public void depositar(Double valor) {
    if (valor <= 0) {
      throw new RuntimeException("Só é possível depositar valores positivos");
    }
    saldo += valor;
  }

  public void transferir(Double valor, Correntista destinatario) {
    this.sacar(valor);
    destinatario.depositar(valor);
  }
}
