package Tarea1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExpendedorTest {
    Expendedor exp;
    @BeforeEach
    void setUp(){
        exp = new Expendedor(4, 400, 500);
    }

    @Test
    @DisplayName("Compras exitosas")
    public void compraExitosa() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        assertNotNull(exp.comprarProducto(new Moneda500(), Expendedor.Productos.COCA));
        assertNotNull(exp.comprarProducto(new Moneda500(), Expendedor.Productos.SPRITE));
        assertNotNull(exp.comprarProducto(new Moneda500(), Expendedor.Productos.SUPER8));
        assertNotNull(exp.comprarProducto(new Moneda500(), Expendedor.Productos.SNICKERS));
    }

    @Test
    @DisplayName("compra sin moneda")
    public void compraSinMoneda() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        assertThrows(PagoIncorrectoException.class, ()->{
            Moneda100 mNull = null;
            exp.comprarProducto(mNull, Expendedor.Productos.SUPER8);
        });
    }

    @Test
    @DisplayName("compra sin stock")
    public void compraSinStock() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        assertThrows(NoHayProductoException.class, ()->{
            exp.comprarProducto(new Moneda500(), Expendedor.Productos.COCA);
            exp.comprarProducto(new Moneda500(), Expendedor.Productos.COCA);
            exp.comprarProducto(new Moneda500(), Expendedor.Productos.COCA);
            exp.comprarProducto(new Moneda500(), Expendedor.Productos.COCA);
            exp.comprarProducto(new Moneda500(), Expendedor.Productos.COCA);
        });
    }

    @Test
    @DisplayName("compra con moneda insuficiente")
    public void compraMonedaInsuficiente() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        assertThrows(PagoInsuficienteException.class, ()->{
            exp.comprarProducto(new Moneda100(), Expendedor.Productos.SUPER8);
        });
    }

}