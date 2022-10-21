package Arreglos;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Write a description of class Arreglos here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (1/feb/2022)
 */
public class Arreglo
{
    public static void main(String []args){
        Scanner lector = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");

        int size = 1;
        int vector [];

        while (size > 0){
            System.out.println("\nTamaño del arreglo o cero para terminar");
            size = lector.nextInt();
            if(size > 0){
                vector = new int[size];

                //Guardar numeros en el vector
                for(int i = 0 ; i<vector.length;i++){
                    System.out.println("Numero ");
                    vector[i] = lector.nextInt();
                }
                //Mostrar el vector
                System.out.println("Mostrar el contenido del vector");
                for(int i = 0 ; i< vector.length;i++){
                    System.out.print(vector[i] + " ");
                }
                //Mostrar el menor y mayor del arreglo
                int menor = vector[0];
                int mayor = vector[0];
                int suma = 0;
                double promedio;
                for(int i = 0 ; i<vector.length;i++){
                    suma+=vector[i];
                    if(vector[i]<menor){
                        menor = vector[i];
                    }
                    if(vector[i]>mayor){
                        mayor = vector[i];
                    }
                }
                promedio = suma / (vector.length * 1.0);
                    System.out.println("Suma: " + suma +
                                       "\nMayor: " + mayor +
                                       "\nMenor: " + menor +
                                       "\nPromedio: " + df.format(promedio));
            }//Esta llave cierra el if
        }//Esta llave cierra el while
    }//Esta llave cierra main
}//Esta linea cierra la clase