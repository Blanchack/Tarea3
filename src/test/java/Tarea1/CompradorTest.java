package Tarea1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static Tarea1.Expendedor.Productos.*;
import static org.junit.jupiter.api.Assertions.*;

class CompradorTest{
    private Comprador com;
    private Expendedor exp;
    @BeforeEach
    void setUp() {
        exp = new Expendedor(3,400, 500);
    }
    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test compra sin moneda")
    public void TestSinMoneda() throws PagoIncorrectoException {
        assertThrows(PagoIncorrectoException.class, () -> {
            Comprador com = new Comprador(null, SPRITE, exp);

        });
    }
    @Test
    @DisplayName("Test vuelto")
    public void TestVuelto() throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        Comprador com  = new Comprador(new Moneda1500(), SPRITE, exp);
        assertEquals(com.cuantoVuelto(), 1500 - 400);

        com  = new Comprador(new Moneda1500(), SNICKERS, exp);
        assertEquals(com.cuantoVuelto(), 1500 - 500);
    }

}