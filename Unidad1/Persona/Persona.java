package Unidad1.Persona;

/**
 * Write a description of class Persona here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (2/23/22)
 */
public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    public Persona(){

    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setPeso(double peso){
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

    public double calcularIMC(){
        double imc = peso / Math.pow(altura, 2);
        return imc;
    }

    public String toString(){
        return ("Nombre " + nombre + " Edad " + edad + 
                " Peso " + peso + " Altura " + altura );
    }
}
