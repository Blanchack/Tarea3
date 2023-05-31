package Tarea1;

public class Main {
    public static void main(String[] args) {

        Expendedor exp = new Expendedor(4, 500, 500);
        Moneda m = null;

        m = new Moneda1000();

        try {

            Comprador c = new Comprador(m, Expendedor.Productos.SPRITE, exp);
            System.out.println(c.queConsumiste()+ ", " +c.cuantoVuelto());
            //exp.comprarBebida(m, 1); no es necesario comprar bebiba manualmente,
            //                         esta implemetado en la clase Comprador.

        } catch (PagoIncorrectoException e) {

            e.printStackTrace(System.out);

            System.out.println("El pago ingresado no es correcto.");

        } catch (PagoInsuficienteException e) {

            e.printStackTrace(System.out);

            System.out.println("El pago ingresado no es suficiente.");

        } catch (NoHayProductoException e) {

            e.printStackTrace(System.out);

            System.out.println("El producto solicitado no se encuentra disponible.");

        }


    }
}
