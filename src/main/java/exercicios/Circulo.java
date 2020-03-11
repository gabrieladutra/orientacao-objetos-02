package exercicios;

public class Circulo {
  private Double raio;

  public Circulo(Double raio) {
    this.raio = raio;
  }

  public Double getRaio() {
    return raio;
  }

  public void setRaio(Double novoRaio) {
    if (novoRaio < 0) {
      throw new RuntimeException("Raio não pode ser negativo.");
    }
    raio = novoRaio;
  }
}
