package Unidad1.Persona;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Write a description of class usarPersona here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (2/23/22)
 */
public class CalcularIMC
{
    public static void main(String[] args){
        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int edad = 1;
        while(edad > 0){
            System.out.print("Ingresa tu nombre ");
            String nombre = sc.nextLine();
            persona.setNombre(nombre);
            System.out.print("\nIngresa tu edad o 0 para terminar ");
            edad = sc.nextInt();
            persona.setEdad(edad);
            System.out.print("\nIngresa tu altura ");
            double altura = sc.nextDouble();
            persona.setAltura(altura);
            System.out.print("\nIngresa tu peso ");
            double peso = sc.nextDouble();
            persona.setPeso(peso);
            System.out.println("Tu IMC es: " + df.format(persona.calcularIMC()));
            System.out.println(persona.toString());
        }
    }
}
