package Tarea1;

/**Excepcion que indica que el pago ingresado no es suficiente.
 */
public class PagoInsuficienteException extends Exception {

    /** Constructor, recibe un String para generar un mensaje de error.
     * @param errorMessage String
     */
    public PagoInsuficienteException(String errorMessage) {

        super(errorMessage);
    }
}
