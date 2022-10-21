package REPASO_FPOO.Modularidad.Vectores;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * Write a description of class Vector here
 * Aplicacion que haga lo siguiente:
 * Tenga un metodo cargar datos a un vector.
 * Tenga un metodo para mostrar los datos del vector.
 * Tenga un metodo para que sume los datos del vector y me de promedio.
 * Tenga un metodo main para definir el vector.
 * El metodo main tenga un ciclo principal que nos pida el tamaño del vector
 * lo cree y mande llamar a los metodos.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (02/09/22)
 */
public class Vectores
{
    public static int[] cargaVector(int[] vec){
        for(int i = 0 ; i < vec.length ; i++){
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor "+ (i + 1)));
        }
        return vec;
    }
    
    public static double calculaPromedio(int[] vector){
        double suma = 0.0;
        
        for(int i = 0 ; i<vector.length ; i++){
            suma += vector[i];
        }
        return suma / vector.length;
    }
    
    public static void muestraVector(int[] vector){
        String salida = " ";
        for(int j = 0 ; j < vector.length ; j++){
            salida = salida + vector[j] + " ";
        }
        JOptionPane.showMessageDialog(null,salida);
    }
    
    public static void main(String[] args){
        //definir un vector
        int [] vector;
        int size = 1;
        DecimalFormat df = new DecimalFormat("#.##");
        //Ciclo principal
        while(size > 0){
            size = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo o cero para terminar"));
            if(size > 0){
                //Crear vector
                vector = new int[size];
                cargaVector(vector);
                double promedio = calculaPromedio(vector);
                JOptionPane.showMessageDialog(null, "Promedio " + df.format(promedio));
                muestraVector(vector);
            }
        }
    }
}
