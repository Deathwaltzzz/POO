package Unidad6.ArchivosDeDatosSimples;
import java.io.*;
import java.util.Scanner;
import java.io.FileInputStream;

/**
 * Write a description of class SumaDosArchivos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumaDosArchivos
{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        //ciclo principal
        int num = 1;
        while(num>0){
            System.out.println("Cuantos enteros a guardar o 0 para terminar");
            num = sc.nextInt();
            if(num>0){
                //Creamos un objeto "archivoUno" y lo
                //asociamos al archivo, en ese momento
                //abrimos el archivo

                File archivoUno = new File("C:DatosEnterosUno.dat");

                // podemos checar si el archivo existe
                if(archivoUno.exists()){
                    System.out.println("El archivo Uno existe");
                }else{
                    System.out.println("EL archivo Uno NO existe!");
                }

                //creamos un objeto "flujoSalidaUno" asociado al "archivoSalidaUno"
                FileOutputStream flujoSalidaUno = new FileOutputStream(archivoUno); //Output destruye lo que tenga, lo vuelve a crear y se le puede meter
                //datos, pero no leer.
                //creamos un objeto "flujoDatosSalidaUno" asociado a "flujoSalidaUno"
                DataOutputStream flujoDatosSalidaUno = new DataOutputStream(flujoSalidaUno); //Input no se puede escribir en el archivo, solo leer

                File archivoDos = new File("C:DatosEnterosDos.dat");

                // podemos checar si el archivo existe
                if(archivoDos.exists()){
                    System.out.println("El archivo Dos existe");
                }else{
                    System.out.println("EL archivo Dos NO existe!");
                }

                //creamos un objeto "flujoSalidaDos" asociado al "archivoSalidaDos"
                FileOutputStream flujoSalidaDos = new FileOutputStream(archivoDos); //Output destruye lo que tenga, lo vuelve a crear y se le puede meter
                //datos, pero no leer.
                //creamos un objeto "flujoDatosSalidaDos" asociado a "flujoSalidaDos"
                DataOutputStream flujoDatosSalidaDos = new DataOutputStream(flujoSalidaDos); //Input no se puede escribir en el archivo, solo leer
                
                // leemos los numeros y se guardan en ambos archivos
                for(int i = 1 ; i <= num ; i++){
                    System.out.print("Teclea el entero " + i + " ");
                    int numero = sc.nextInt();
                    flujoDatosSalidaUno.writeInt(numero);
                    System.out.println("Teclea el entero " + i + " ");
                    int numer2 = sc.nextInt();
                    flujoDatosSalidaDos.writeInt(numer2); //escribir enteros sobre el file
                }
                
                //cerramos los archivos
                flujoDatosSalidaUno.close();
                flujoDatosSalidaDos.close();
                
                //File archivoEntradaUno = new File("C:DatosEnterosUno.dat");
                FileInputStream flujoEntradaUno = new FileInputStream(archivoUno);
                DataInputStream flujoDatosEntradaUno = new DataInputStream(flujoEntradaUno);
                
                //File archivoEntradaDos = new File("C:DatosEnterosDos.dat");
                FileInputStream flujoEntradaDos = new FileInputStream(archivoDos);
                DataInputStream flujoDatosEntradaDos = new DataInputStream(flujoEntradaDos);
                
                System.out.println("Suma de numeros");
                
                int numUno, numDos, suma;
                int tam = (int)archivoUno.length()/4;
                
                for(int i = 1 ; i <=tam ; i++){
                    numUno = (flujoDatosEntradaUno.readInt());
                    System.out.print(numUno+ " + ");
                    
                    numDos = (flujoDatosEntradaDos.readInt());
                    System.out.print(numDos+ " = ");
                    
                    suma = numUno + numDos;
                    System.out.print(suma);
                    
                    System.out.println(" ");
                }
                
                flujoDatosEntradaUno.close();
                flujoDatosEntradaDos.close();
            }//if
        }//while
    }//main
}//clase
