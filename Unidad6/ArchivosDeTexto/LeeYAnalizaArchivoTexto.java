package Unidad6.ArchivosDeTexto;
import java.io.*;
import java.util.*;

/**
 * Write a description of class LeeYAnalizaArchivoTexto here
 * Aplicacion que:
 * a) Lee datos de tipo texto de un archivo TextoCapturado.txt
 * b) Cada registro 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeeYAnalizaArchivoTexto
{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String nombre;
        String materia;
        String promString;
        double promedio, total = 0, promTotal;
        int alumnos =0;
        
        File archivoEntrada = new File("TextoCapturado.txt");
        FileReader lectorArchivo = new FileReader(archivoEntrada);
        BufferedReader bufferLectura = new BufferedReader(lectorArchivo);
        
        String linea ="";
        
        while(linea !=null){
            linea = bufferLectura.readLine();
            if(linea!=null){
                System.out.println("\n" + linea);
                
                StringTokenizer analizador = new StringTokenizer(linea);
                nombre = analizador.nextToken();
                materia = analizador.nextToken();
                promString = analizador.nextToken();
                promedio = Double.parseDouble(promString);
                total = total + promedio;
                alumnos++;
                System.out.println("\nNombre " + nombre);
                System.out.println("Materia " + materia);
                System.out.println("Promedio " + promString);
            }
        }//while
        System.out.println("\nSuma total " + total);
        promTotal = total/alumnos;
        System.out.println("\nPromedio total: " + promTotal);
        bufferLectura.close();
    }
}
