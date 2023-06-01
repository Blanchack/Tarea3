package Tarea1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DepositoTest {

    @Test
    @DisplayName("Test getObj para size > 0")
    public void testDepositoConElementos() {
        // test para monedas
        Deposito<Moneda> dMon = new Deposito<>();
        dMon.addObj(new Moneda1500());
        assertNotNull(dMon.getObj());

        //test para productos

        Deposito<Producto> dProd = new Deposito<>();
        dProd.addObj(new CocaCola(12));
        assertNotNull(dProd.getObj());
    }

    @Test
    @DisplayName("Test getObj para size = 0")
    public void testDepositoSinElememtos() {
        Deposito<Producto> deposito = new Deposito<>();
        Producto producto = deposito.getObj();

        assertNull(producto);
    }
}