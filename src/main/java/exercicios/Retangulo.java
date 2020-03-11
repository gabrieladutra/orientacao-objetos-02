package exercicios;

public class Retangulo {
  private Double ladoBase;
  private Double ladoAltura;

  // construtor
  public Retangulo(Double ladoBase, Double ladoAltura) {
    setLadoBase(ladoBase);
    setLadoAltura(ladoAltura);
  }

  // getter
  public Double getLadoBase() {
    return ladoBase;
  }

  public Double getLadoAltura() {
    return ladoAltura;
  }

  // setter
  public void setLadoBase(Double ladoBase) {
    if (ladoBase < 0) {
      throw new RuntimeException("Lado negativo");
    }
    this.ladoBase = ladoBase;
  }

  public void setLadoAltura(Double ladoAltura) {
    if (ladoAltura < 0) {
      throw new RuntimeException("Lado negativo");
    }
    this.ladoAltura = ladoAltura;
  }
}
