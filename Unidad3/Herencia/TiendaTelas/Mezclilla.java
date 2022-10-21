package Unidad3.Herencia.TiendaTelas;


/**
 * Write a description of class Mezclilla here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (a version number or a date)
 */
public class Mezclilla extends Telas
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Mezclilla
     */
    public Mezclilla(String tipo, String color)
    {
        // initialise instance variables
        super(tipo,color);
    }

    public void calculaImporte(){
        importe = getPrecio() * getCantidad() * 1.15;
    }
}
