package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTeste {

  @Test
  public void construtor_quandoNumeroInteiroPositivo_deveRetornarUmaInstancia(){
    // arrange
    Double inteiro = 5d;
    // act
    Quadrado q = new Quadrado(inteiro);
    // assert
    assertNotNull(q);
  }
      // o que testando , cenario atual resultado esperado



  @Test
  public void setLado_quandoLadoForNegativo_deveLancarUmaExcecao(){
    Quadrado q = new Quadrado(5d); // arrange
    // lambda: () ->
    // verificar excecao
    assertThrows(RuntimeException.class, () -> q.setLado(-4d));
  }

  @Test
  public void setlado_quandoLadoForPositivo_deveAlterarLado(){
    Quadrado q = new Quadrado(5d);
    Double valorEsperado = 10.25;
    q.setLado(valorEsperado);
    assertEquals(valorEsperado , q.getLado());
  }

}

