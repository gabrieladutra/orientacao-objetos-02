package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTeste {
  @Test
  public void setRaio_quandoValorPositivo_deveAlterarValor() {
    Double novoR = 15d;
    Circulo c = new Circulo(10d);
    c.setRaio(novoR);
    assertEquals(novoR, c.getRaio());
  }

  @Test
  public void setRaio_quandoValorNegativo_deveAlterarValor() {
    Circulo c = new Circulo(10d);
    assertThrows(RuntimeException.class, () -> c.setRaio(-15d));
  }
}
