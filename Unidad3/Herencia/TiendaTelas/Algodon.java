package Unidad3.Herencia.TiendaTelas;


/**
 * Write a description of class Algodon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algodon extends Telas
{

    /**
     * Constructor for objects of class Algodon
     */
    public Algodon(String tipo, String color)
    {
        // initialise instance variables
        super(tipo,color);
    }
    
    //Cantidad y precio son private por lo tanto los uso a travez de los get
    //importe es protected lo uso directo
    
    public void calculaImporte(){
        importe = getCantidad() * getPrecio() * 1.10;
    }
}
