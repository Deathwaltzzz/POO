package Unidad3.Herencia.Persona;


/**
 * Write a description of class Estudiante here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    // instance variables
    private double promedio;
    
    /**
     * Constructor for objects of class estudiante
     */
    public Estudiante(String nombre, int edad, double promedio){
        super (nombre, edad);
        this.promedio = promedio;
    }
    
    /**
     * @param void
     * @return cadena con la informacion del estudiante
     */
    public String toString(){
        return super.toString() + " promedio" + promedio;
     }
}
