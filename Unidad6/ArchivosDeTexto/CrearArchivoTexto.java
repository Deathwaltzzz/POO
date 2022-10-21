package Unidad6.ArchivosDeTexto;

import java.io.*;
import java.util.*;

/**
 * Write a description of class CrearArchivoTexto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CrearArchivoTexto
{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File archivoSalida = new File("TextoCapturado.txt");
        FileOutputStream flujoSalida = new FileOutputStream(archivoSalida);
        PrintWriter archivoTxt = new PrintWriter(archivoSalida);
        
        Scanner sc = new Scanner(System.in);
        String nombre;
        String materia;
        double promedio;
        boolean continuar = false;
        
        do{
            System.out.println("Teclea el nombre ");
            nombre = sc.nextLine();
            System.out.println("Teclea la materia");
            materia = sc.nextLine();
            System.out.println("Teclea el promedio ");
            promedio = sc.nextDouble();
            //sc.nextLine();
            
            archivoTxt.println(nombre + " "+materia+" "+promedio);
            //archivoTxt.println(nombre);
            //archivoTxt.println(materia);
            //archivoTxt.println(promedio);
            
            System.out.println("1) Continuar 2) Terminar");
            int opc = sc.nextInt();
            sc.nextLine();
            if(opc == 1){
                 continuar= true;
            }else{
                continuar = false;
                archivoTxt.close();
            }
        }while(continuar);
    }//fin main
}//fin clase
