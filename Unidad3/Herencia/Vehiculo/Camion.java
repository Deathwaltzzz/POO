package Unidad3.Herencia.Vehiculo;


/**
 * Write a description of class Camion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Camion extends Vehiculo
{
    // instance variables - replace the example below with your own
    private double capacidadCarga;

    /**
     * Constructor for objects of class Camion
     */
    public Camion(String marca, String modelo, int año, double capacidadCarga)
    {
        super (marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Metodo toString para devolver los valores en formato de cadena
     *
     * @param  void
     * @return    Los valores de la clase en formato de cadena del metodo super de la clase heredada Vehiculo
     */
    public String toString()
    {
        return super.toString() + "\nCapacidad de carga " + capacidadCarga;
    }
}
