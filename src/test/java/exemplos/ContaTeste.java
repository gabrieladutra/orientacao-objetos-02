package exemplos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta conta1;

    @BeforeEach
    public void beforeEach() {
        conta1 = new Conta();
        conta1.setNumero(1);
        conta1.setSaldo(100d);
    }

    @AfterEach
    public void afterEach() {
        conta1 = null;
    }

    @Test
    public void criarObjetoConta() {
        assertNotNull(conta1);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(conta1.getNumero());
        assertNotNull(conta1.getSaldo());
    }

    @Test
    public void metodoSetNumero() {
        Integer numero = 15;
        conta1.setNumero(numero);
        assertEquals(numero, conta1.getNumero());
    }

    @Test
    public void metodoDepositar() {
        Double valor = 10d;
        Double saldoInicial = conta1.getSaldo();
        conta1.depositar(valor);
        assertEquals(saldoInicial + valor, conta1.getSaldo());
    }

    @Test
    public void metodoDepositarValorInvalido() {
        assertThrows(RuntimeException.class, () -> conta1.depositar(-200.0));
    }

    @Test
    public void metodoSacar() {
        Double valor = 10d;
        Double saldoInicial = conta1.getSaldo();
        conta1.sacar(valor);
        assertEquals(saldoInicial - valor, conta1.getSaldo());
    }

    @Test
    public void metodoSacarValorInvalido() {
        assertThrows(RuntimeException.class, () -> conta1.sacar(-200.0));
    }

    @Test
    public void metodoSacarSaldoInsuficiente() {
        assertThrows(RuntimeException.class, () -> conta1.sacar(1200.0));
    }

}
