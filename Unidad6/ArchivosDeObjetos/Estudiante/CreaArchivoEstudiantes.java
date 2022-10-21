package Unidad6.ArchivosDeObjetos.Estudiante;
import java.io.*;

/**
 * Write a description of class CreaArchivoEstudiantes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreaArchivoEstudiantes
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        AdministraEstudiantes archivo = new AdministraEstudiantes("Estudiantes.txt");
        archivo.crearArchivo();
        archivo.leerArchivo();
    }
}
