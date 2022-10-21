package Unidad2.ArreglosDeObjetos.Persona;


/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombre;
    private int edad;
    private double peso, altura;
    
    public Persona(){
        
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setPEso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }
    
    public double calcularImc(){
        return peso / Math.pow(altura,2);
    }
    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nPeso: " + peso + "\nAltura " + altura;
    }
}
