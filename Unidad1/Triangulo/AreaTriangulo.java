package Unidad1.Triangulo;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Write a description of class AreaTriangulo here
 * Aplicacion para crear objetos de Triangulo y usar su metodos.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (17/02/22)
 */
public class AreaTriangulo
{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        
        double lA, lB, lC;
        System.out.print("Lado A ");
        lA = sc.nextDouble();
        System.out.print("Lado B ");
        lB = sc.nextDouble();
        System.out.print("Lado C ");
        lC = sc.nextDouble();
        //pasar valores al objeto t1
        t1.setLadoA(lA);
        t1.setLadoB(lB);
        t1.setLadoC(lC);
        //calcular perimetro y area
        double per = t1.calcularPerimetro();
        double area = t1.calcularArea();
        //mostrar resultados;}
        System.out.println("El perimetro es " + df.format(per));
        System.out.println("El area es " + df.format(area));
        System.out.println("Valores del objeto t1 " + t1.toString());
        
        Triangulo t2 = new Triangulo(8.8, 6.6, 4.4);
        System.out.println("El perimetro es " + df.format(t2.calcularPerimetro()));
        System.out.println("El area es " + df.format(t2.calcularArea()));
    }
}
