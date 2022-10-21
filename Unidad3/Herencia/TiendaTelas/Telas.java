package Unidad3.Herencia.TiendaTelas;
import java.text.DecimalFormat;


/**
 * Write a description of class Telas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Telas
{
    DecimalFormat df = new DecimalFormat("$.##");
    // instance variables - replace the example below with your own
    /**
     * Los atributos privados solo se pueden usar en esta clase pero no en las subclases.
     * Para usarlos en las sublclases es a travez de los metodos get y set.
     * Los atributos protected pueden ser usados en esta clase y en las subclases.
     */
    
    private String tipo,color;
    private int cantidad;
    private double precio;
    protected double importe;
    
    /**
     * Constructor for objects of class Telas
     */
    public Telas(String tipo, String color)
    {
        this.tipo = tipo;
        this.color = color;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    public double getPrecio(){
        return precio;
    }
    
    public String toString(){
        return "\nTipo tela " + tipo +
               "\nColor tela " + color +
               "\nCantidad " + cantidad +
               "\nPrecio " + precio +
               "\nImporte " + df.format(importe);
    }
}
