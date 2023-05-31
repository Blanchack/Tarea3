package Tarea1;

/**
 * Clase que simula a un comprador inresando dinero y seleccionando un producto en un expendedor.
 * @author Darwin Albornoz
 * @author Alex Blanchard
 * @version versión 1, 28 de abril de 2023
 * @see PagoIncorrectoException
 */

class Comprador{
    private String sonido;
    private int vuelto;
    
    /** Metodo constructor clase Comprador
    * @param m primero Moneda 
    * @param productoId segundo int
    * @param ex tercero Expendedor
    * @throws  PagoIncorrectoException  puede lanzar esta excepción si la moneda ingresada no es valida (null).
    */

    public Comprador(Moneda m, Expendedor.Productos productoId, Expendedor ex) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        vuelto = 0;
        sonido = "null";
        
        if( m ==  null){ 
            throw new PagoIncorrectoException("Se intento comprar sin moneda"); 
        }
        Producto p = ex.comprarProducto(m, productoId);
        if(p != null) {
            sonido = p.consumir();
        }
        Moneda aux = ex.getVuelto();
        while (aux != null){
            vuelto += aux.getValor();
            aux = ex.getVuelto();
        }
    }
    
    // Metodo cuantoVuelto, retorna el valor del vuelto retirado por el comprador.
    public int cuantoVuelto() {return vuelto;}
    
    // Metodo queConsumiste, retorna un string indicando el producto adquirido por el comprador desde el expendedor.
    public String queConsumiste() {return sonido;}

}
