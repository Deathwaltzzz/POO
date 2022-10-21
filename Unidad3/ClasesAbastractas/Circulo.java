package Unidad3.ClasesAbastractas;
import java.text.DecimalFormat;

/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Superficie
{
    private double radio;
    
    DecimalFormat df = new DecimalFormat("#.##");
    
    public Circulo (double radio)
    {
        this.radio = radio;
    }
    /**
     * Este metodo se tiene que declarar de forma obligada por que
     * la clase abstracta superfiecie se declaro un metodo 
     * CalculaArea de forma abstracta
     */
    public void calculaArea()
    {
       area = (Math.PI * Math.pow(radio,2));   
    }
    public String toString()
    {
        return "radio " +radio+ " area " +df.format(area);
    }
}
