package Tarea1;

/**
 * Representacion de una bebida que hereda atributos y metodos de Produto para pasarlos a sus subclases CocaCola y Srpite.
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */

abstract class Bebida extends Producto{

    /** Metodo constructor clase Bebida
    *@param serie primero int 
    */
    public Bebida(int serie){
        super(serie);

    }

}
