package Tarea1;

/**
 * Un dulce de tipo Snickers
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 */
public class Snickers extends Dulce{
    
    /**Metodo constructor clase Snickers.
    * @param s primero int
    */
    public Snickers(int s){
        super(s);
    }
    
    /**Metodo consumir
    * return un string con el nombre del producto "snickers".
    */
    public String consumir(){
        return "snickers";
    }
}
