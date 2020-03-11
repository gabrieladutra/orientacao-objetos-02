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
        conta1.numero = 1;
        conta1.saldo = 100.0;
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
        assertNotNull(conta1.numero);
        assertNotNull(conta1.saldo);
    }

    @Test
    public void metodoSetNumero() {

    }

    @Test
    public void metodoDepositar() {

    }

//    @Test
//    public void metodoDepositarValorInvalido() {
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.depositar(-200.0));
//        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
//    }

    @Test
    public void metodoSacar() {

    }

    @Test
    public void metodoSacarValorInvalido() {

    }

    @Test
    public void metodoSacarSaldoInsuficiente() {

    }

    @Test
    public void metodoTransferir() {

    }

    @Test
    public void metodoTransferirValorInvalido() {

    }

    @Test
    public void metodoTransferirSaldoInsuficiente() {

    }
}
