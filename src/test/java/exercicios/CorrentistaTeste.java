package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
  @Test
  public void sacar_quandoSaldoSuficiente_deveDiminuirSaldo() {
    Double saldoInicial = 10d;
    Double qtdSacar = 5d;
    Correntista c = new Correntista(1, 2, saldoInicial);
    c.sacar(qtdSacar);
    assertEquals(saldoInicial - qtdSacar, c.getSaldo());
  }

  @Test
  public void sacar_quandoSaldoInsuficiente_deveLancarExcecao() {
   assertThrows(RuntimeException.class, () -> new Correntista(1, 2, 3d).sacar(5d));
  }

  @Test
  public void depositar_quandoValorPositivo_deveIncrementarSaldo() {
    Double saldoInicial = 10d;
    Double qtdDepositar = 5d;
    Correntista c = new Correntista(1, 2, saldoInicial);
    c.depositar(qtdDepositar);
    assertEquals(saldoInicial + qtdDepositar, c.getSaldo());
  }

  @Test
  public void depositar_quandoValorNegativo_deveLancarExcecao() {
    assertThrows(RuntimeException.class, () -> new Correntista(1,2, 3d).depositar(-2d));
  }

  @Test
  public void transferir_quandoValoresValidos_deveTransferir() {
    Double saldoRemetente = 10d;
    Double saldoDestinatario = 20d;
    Double valor = 5d;
    Correntista remetente = new Correntista(1,2,saldoRemetente);
    Correntista destinatario = new Correntista(2, 3, saldoDestinatario);
    remetente.transferir(valor, destinatario);
    assertEquals(saldoRemetente - valor, remetente.getSaldo());
    assertEquals(saldoDestinatario + valor, destinatario.getSaldo());
  }

}
