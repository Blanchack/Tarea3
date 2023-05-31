package Tarea1;

/**
 * Una bebida de tipo CocaCola
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */

class CocaCola extends Bebida{

    /**Metodo constructor clase CocaCola.
     * @param s primero int
     */
    public CocaCola(int s){
        super(s);
    }

    /**Metodo consumir
     * return un string con el nombre del producto "cocacola".
     */
    public String consumir(){
        return "cocacola";
    }
}