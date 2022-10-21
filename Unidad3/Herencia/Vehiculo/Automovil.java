package Unidad3.Herencia.Vehiculo;


/**
 * Write a description of class Automovil here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (29/03/22)
 */
public class Automovil extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int numPasajeros;

    /**
     * Constructor for objects of class Automovil
     */
    public Automovil(String marca, String modelo, int año, int numPasajeros)
    {
        super (marca, modelo, año); //utiliza el constructor de Vehiculo
        this.numPasajeros = numPasajeros;
    }

    /**
     * Metodo toString para devolver los datos en forma de cadena
     *
     * @param  void
     * @return    Valor del metodo Super a string + valores de la clase propia
     */
    public String toString()
    {
        return super.toString() + "\nnum pasajeros " + numPasajeros;
    }
}
