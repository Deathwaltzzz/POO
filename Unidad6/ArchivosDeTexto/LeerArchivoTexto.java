package Unidad6.ArchivosDeTexto;
import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class LeerArchivoTexto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeerArchivoTexto
{
    public static void main(String[] args) throws IOException, FileNotFoundException{
        File archivoEntrada = new File("TextoCapturado.txt");
        FileReader lectorArchivo = new FileReader(archivoEntrada);
        BufferedReader buferLectura = new BufferedReader(lectorArchivo);
        
        String linea ="";
        while(linea!=null){
            linea = buferLectura.readLine();
            if(linea !=null){
                System.out.println(linea);
            }
        }
        buferLectura.close();
    }
}
