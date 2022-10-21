package Unidad1.Triangulo;


/**
 * Write a description of class Triangulo here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (17/02/22)
 */
public class Triangulo
{
    // instance variables - replace the example below with your own
    private double ladoA, ladoB, ladoC;

    /**
     * Constructor for objects of class Triangulo
     */
    public Triangulo()
    {
        // initialise instance variables
    }
    
    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public void setLadoA(double ladoA){
        this.ladoA = ladoA;
    }
    public void setLadoB(double ladoB){
        this.ladoB = ladoB;
    }
    public void setLadoC(double ladoC){
        this.ladoC = ladoC;
    }
    
    public double getLadoA(){
        return ladoA;
    }
    public double getLadoB(){
        return ladoB;
    }
    public double getLadoC(){
        return ladoC;
    }
    
    public double calcularPerimetro(){
        return ladoA + ladoB + ladoC;
    }
    public double calcularArea(){
        double s;
        s = (ladoA + ladoB + ladoC) / 2.0;
        double area = Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
        return area;
    }
    public String toString(){
        return ("ladoA " + ladoA + " ladoB " + ladoB + " ladoC " + ladoC);
    }
}
