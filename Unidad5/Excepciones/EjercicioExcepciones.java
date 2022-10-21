package Unidad5.Excepciones;
import java.util.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

/**
 * Write a description of class EjercicioExcepciones here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EjercicioExcepciones
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        //variables
        double arreglo[], dato = 0, suma, promedio;
        double menor, mayor;
        int i, num = 1;
        String nombre;
        boolean valido = true;

        System.out.println("Teclea tu nombre");
        nombre = sc.next();
        while(valido){
            try{
                System.out.println("Tamaño del arreglo");
                num = sc.nextInt();
                valido = false;
            }catch(InputMismatchException e){
                //System.out.println(e.getMessage());
                System.out.println("No es entero");
                String enter = sc.next();
            }catch (Exception e){
                //System.out.println("Error general");
                String enter = sc.next();
            }
        }//while

        arreglo = new double[num];

        //pedir datos a guardar en el arreglo

        for(i = 0 ; i < arreglo.length ; i++){
            valido = true;
            while(valido){
                try{
                    System.out.println("Teclea numero " + (i+1) + " a guardar");
                    arreglo[i] = sc.nextDouble();
                    valido = false;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("Error general");
                    String enter = sc.next();
                }

            }
        }
        
        //sumar los datos para obtener el promedio, el mayor y el menor
        suma = 0;
        menor = arreglo[0];
        mayor = arreglo[0];
        for(i = 0 ; i < arreglo.length ; i++){
            suma += arreglo[i];
            if(arreglo[i]> mayor){
                mayor = arreglo[i];
            }
            if(arreglo[i]<menor){
                menor = arreglo[i];
            }
        }
        promedio = suma / arreglo.length;
        System.out.println(nombre + "\nLa suma es: " + suma + "\nEl promedio es: " + df.format(promedio) + "\nEl menor es: " + menor + "\nEl mayor es: "+ mayor); 
    }
}
