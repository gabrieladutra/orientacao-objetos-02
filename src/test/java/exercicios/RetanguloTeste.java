package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {

  @Test
  public void construtor_quandoUmNumeroInteiroForPositivo_deveRetornarUmainstancia(){
    Double ladoB = 10d;
    Double ladoA = 15d;
    Retangulo r =  new Retangulo(ladoB, ladoA);
    assertEquals(r.getLadoBase(), ladoB);
    assertEquals(r.getLadoAltura(), ladoA);
  }

  @Test
  public void setLadoBase_quandoNumeroNegativo_deveLancarExcessao(){
    Retangulo r = new Retangulo(10d, 15d);
    assertThrows(RuntimeException.class, () -> r.setLadoBase(-5d));
  }

  @Test
  public void setLadoAltura_quandoNumeroNegativo_deveLancarExcessao(){
    Retangulo r = new Retangulo(10d, 15d);
    assertThrows(RuntimeException.class, () -> r.setLadoAltura(-5d));
  }
}
