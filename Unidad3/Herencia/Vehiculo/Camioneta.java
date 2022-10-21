package Unidad3.Herencia.Vehiculo;


/**
 * Write a description of class Camioneta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Camioneta extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int numPuertas;

    /**
     * Constructor for objects of class Camioneta
     */
    public Camioneta(String marca,String modelo, int año, int numPuertas)
    {
        // initialise instance variables
        super (marca, modelo, año);
        this.numPuertas = numPuertas;
    }

    /**
     * Metodo toString para devolver los parametros en formato de cadena
     *
     * @param  void
     * @return    Los valores de la clase en forma de String con el metodo Super heredado de Vehiculo
     */
    public String toString()
    {
        // put your code here
        return super.toString() + "\nNumero de puertas " + numPuertas;
    }
}
