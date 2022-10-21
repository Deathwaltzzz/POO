package Unidad3.ClasesAbastractas;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Write a description of class Superficies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AplicacionSuperficies
{
    public static void main(String[] args){
        //declarar variables
        double base;
        double altura;
        double radio;
        //declarar los objetos
        
        //Superficie superficie = new Superficie()
        //No se PUEDE crear un objeto de una clase abstracta
        
        DecimalFormat df = new DecimalFormat("#.###");
        Circulo circulo = new Circulo(5.5);
        Rectangulo rectangulo = new Rectangulo(3.0,4.0);
        
        circulo.calculaArea();
        rectangulo.calculaArea();
        
        System.out.println("Area del circulo: " + df.format(circulo.getArea()));
        System.out.println("Area del recangulo: " + df.format(rectangulo.getArea()));
        Superficie[] arreglo = new Superficie[3];
        arreglo[0] = circulo;
        arreglo[1] = rectangulo;
        arreglo[2] = new Circulo(6.0);
        System.out.println("Objeto 0 " + arreglo[0].toString());
        System.out.println("Objeto 1 " + arreglo[1].toString());
        arreglo[2].calculaArea();
        System.out.println("Objeto 2 " + arreglo[2].toString());
    }
}
