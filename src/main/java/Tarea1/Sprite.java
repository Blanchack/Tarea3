package Tarea1;

/**
 * Una bebida de tipo Sprite
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */

class Sprite extends Bebida{

    /**Metodo constructor clase Sprite.
     * @param s primero int
     */
    public Sprite(int s){
        super(s);
    }

    /**Metodo consumir
     * return un string con el nombre del producto "sprite".
     */
    public String consumir(){
        return "sprite";
    }
}