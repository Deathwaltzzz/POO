package Unidad6.ArchivosDeObjetos.Estudiante;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 * Write a description of class AdministraEstudiantes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdministraEstudiantes
{
    //variables de instancia
    private String nombreArchivo;
    
    public AdministraEstudiantes(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    
    DecimalFormat df = new DecimalFormat("#.##");
    
    public void crearArchivo() throws FileNotFoundException, IOException{
        File archivoSalida = new File(nombreArchivo);
        FileOutputStream flujoSalida = new FileOutputStream(archivoSalida);
        ObjectOutputStream archivoObjetos = new ObjectOutputStream(flujoSalida);
        
        String nombre;
        int matricula = 1;
        double nota1,nota2,nota3;
        
        while(matricula>0){
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Teclea la matricula del alumno o 0 para terminar"));
            if(matricula>0){
                nombre = JOptionPane.showInputDialog("Nombre del alumno");
                
                Estudiante unObjeto = new Estudiante(nombre, matricula);
                
                nota1 = Double.parseDouble(JOptionPane.showInputDialog("Teclea la calificacion 1"));
                unObjeto.setCalificacion1(nota1);
                
                nota2 = Double.parseDouble(JOptionPane.showInputDialog("Teclea la calificacion 2"));
                unObjeto.setCalificacion2(nota2);
                
                nota3 = Double.parseDouble(JOptionPane.showInputDialog("Teclea la calificacion 3"));
                unObjeto.setCalificacion3(nota3);
                
                archivoObjetos.writeObject(unObjeto);
            }
        }
        archivoObjetos.close();
    }
    
    public void leerArchivo() throws FileNotFoundException, IOException, ClassNotFoundException{
        File archivoEntrada = new File(nombreArchivo);
        FileInputStream flujoEntrada = new FileInputStream(archivoEntrada);
        ObjectInputStream archivoObjetos = new ObjectInputStream(flujoEntrada);
        double suma = 0;
        
        int numEst = 0;
        boolean continuar;
        do{
            continuar = true;
            try{
                Estudiante unEstudiante = (Estudiante)archivoObjetos.readObject();
                //El metodo lo lee como un object y no se podrian accesar los metodos de estudiante,
                //se hace una conversion (casting) del tipo del objeto al tipo estudiante y ahora si se pueden
                //usar sus metodos
                System.out.println(unEstudiante.toString());
                System.out.println("Promedio del estudiante " + df.format(unEstudiante.calculaPromedioAritmetico()));
                double promedio = unEstudiante.calculaPromedioAritmetico();
                suma = suma + promedio;
                numEst++;
            }catch(EOFException e){ // EOF detecta el final del archivo y termina el programa en un catch, End Of File
                continuar = false;
            }
        }while(continuar);
        double promedio = suma / numEst;
        System.out.println("Promedio general " + df.format(promedio));
        archivoObjetos.close();
    }
}
