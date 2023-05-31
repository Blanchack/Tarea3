package Tarea1;

/**
 * Representacion de un dulce que hereda atributos y metodos de Produto para pasarlos a sus subclases Snickers y Super8.
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */

abstract class Dulce extends Producto{

    /**Metodo constructor clase Dulce
    * @param serie primero int
    */
    public Dulce(int serie){
        super(serie);

    }
}
