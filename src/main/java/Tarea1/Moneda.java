package Tarea1;

/**
 * Clase Moneda, usada por Comprador y Expendedor.
 */
abstract class Moneda implements Comparable<Moneda>{

    protected int valor;
    protected int serie;

    public Moneda(){
    }
    public Moneda getSerie(){
        return this;
    }

    public abstract int getValor();

    /**
     * Compara 2 monedas segun su valor.
     * @param m la moneda que se compara.
     * @return La diferencia de valor entre las 2 monedas.
     */
    public int compareTo(Moneda m) {
        return (this.getValor() - m.getValor());
    }
}