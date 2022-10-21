package Unidad1.Circulo;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Write a description of class AreaCirculo here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (16/09/22)
 */
public class AreaCirculo
{
    public static void main(String[] args){
        //creacion de objetos
        DecimalFormat df = new DecimalFormat("#.###");
        Scanner sc = new Scanner(System.in);
        
        Circulo circulo;
        circulo = new Circulo();
        Circulo cir = new Circulo();
        Circulo c2 = new Circulo(12.5);
        // atributos
        
        double r1, area, circunferencia;
        String nombre;
        //leer datos de entrada
        
        System.out.println("Teclea tu nombre");
        nombre = sc.next();
        System.out.println("Radio ");
        r1 = sc.nextDouble();
        
        // manda llamar a los metodos de la clase instanciable
        
        circulo.setRadio(r1);
        area = circulo.calcularArea();
        circunferencia = circulo.calcularCircunferencia();
        
        //muestra resultados
        
        System.out.println(nombre +" area del circulo " + df.format(area));
        System.out.println(nombre + "Circunferencia " + df.format(circunferencia));
        
        Circulo c3 = new Circulo(4.5);
        System.out.println("Area " + df.format(c3.calcularArea()));
        System.out.println("Circ " + df.format(c3.calcularCircunferencia()));
        System.out.println(circulo.toString());
    }
}
