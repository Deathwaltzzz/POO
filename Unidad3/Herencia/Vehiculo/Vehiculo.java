package Unidad3.Herencia.Vehiculo;


/**
 * Write a description of class Vehiculo here.
 *
 * @author (your name)
 * @version (03/29/22)
 */
public class Vehiculo
{
    // instance variables
    private String marca;
    private String modelo;
    private int año;

    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo(String marca, String modelo, int año)
    {
        // initialise instance variables
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        return "Marca " + marca +
               "\nModelo " + modelo +
               "\nAño " + año;
    }
}
