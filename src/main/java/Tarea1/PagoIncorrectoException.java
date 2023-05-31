package Tarea1;

/**Excepcion que indica que el pago ingresado no es valido.
 */
public class PagoIncorrectoException extends Exception {

    /** Constructor, recibe un String para generar un mensaje de error.
     * @param errorMessage String
     */
    public PagoIncorrectoException(String errorMessage) {

        super(errorMessage);
    }
}
