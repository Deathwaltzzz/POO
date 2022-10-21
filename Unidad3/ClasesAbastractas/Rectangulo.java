package Unidad3.ClasesAbastractas;

import java.text.DecimalFormat;

/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo extends Superficie
{
    private double base;
    private double altura;
    
    DecimalFormat df = new DecimalFormat("#.##");
    
    public Rectangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }
    /**
     * Este metodo se tiene que declarar de forma obligada por que
     * la clase abstracta superfiecie se declaro un metodo 
     * CalculaArea de forma abstracta
     */
    public void calculaArea()
    {
        area = (base * altura);
    }
    public String toString()
    {
        return "base " +base+ " altura " +altura+ " area "+df.format(area);
    }
}