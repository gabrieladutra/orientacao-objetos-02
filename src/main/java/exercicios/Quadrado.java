package exercicios;

public class Quadrado {
  private Double lado;

  // construtor retorna uma instancia da classse de onde está inserida
  //     especifica como é a criacao do on=bjeto da classe -> not null
  public Quadrado(Double lado) {
   setLado(lado);
  }

  public Double getLado() {
    return lado;
  }

  public void setLado(Double lado) {
    if (lado < 0) {
      throw new RuntimeException("Lado negativo");
    }
    this.lado = lado;

  }
}
