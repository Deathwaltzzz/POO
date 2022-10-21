package Unidad3.Herencia.Persona;

/**
 * Write a description of class Empleado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Empleado extends Persona
{
    // instance variables 
    private double salario;

    /**
     * Constructor for objects of class Empleado
     */
    public Empleado(String nombre, int edad, double salario)
    {
        super (nombre, edad);
        this.salario = salario;
    }

    /**
     * Metodo toString
     *
     * @param  void
     * @return    cadena con la informacion del empleado
     */
    public String toString()
    {
        return super.toString() + " salario " + salario;
    }

}
