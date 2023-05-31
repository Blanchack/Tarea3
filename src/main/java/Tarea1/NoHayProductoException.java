package Tarea1;

/**Excepcion que indica que el producto solicitado no está disponible.
 */
public class NoHayProductoException extends Exception {

    /** Constructor, recibe un String para generar un mensaje de error.
     * @param errorMessage String
     */
    public NoHayProductoException(String errorMessage) {

        super(errorMessage);
    }
}
