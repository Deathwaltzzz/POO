package Unidad3.Herencia.Persona;


/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private int edad;
    private String nombre;
    
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String toString()
    {
        return "Nombre " +nombre+ " edad " +edad;
    }
}
