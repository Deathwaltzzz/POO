package Unidad6.ArchivosDeDatosSimples;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.DataOutputStream;

/**
 * Write a description of class GeneraDosArchivosDeUno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GeneraDosArchivosDeUno
{
    public static void main(String[] args)throws IOException, FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        File datosEnterosUno = new File("C:DatosEnterosEntrada.dat");
        FileOutputStream flujoSalidaUno = new FileOutputStream(datosEnterosUno);
        DataOutputStream datosSalidaUno = new DataOutputStream(flujoSalidaUno);
        System.out.println("Tamaño maximo de numeros");
        int num = sc.nextInt();
        while(num !=0){
            for(int i = 1 ; i <= num ; i++){
                System.out.println("Introduzca el numero " + i + ": ");
                int numero = sc.nextInt();
                datosSalidaUno.writeInt(numero);
            }
            datosSalidaUno.close();
            
            FileInputStream flujoEntradaUno = new FileInputStream(datosEnterosUno);
            DataInputStream datosEntradaUno = new DataInputStream(flujoEntradaUno);
            
            File datosEnterosPares = new File("C:DatosEnterosPares.dat");
            File datosEnterosImpares = new File("C:DatosEnterosImpares.dat");
            
            FileOutputStream flujoSalidaPares = new FileOutputStream(datosEnterosPares);
            FileOutputStream flujoSalidaImpares = new FileOutputStream(datosEnterosImpares);
            
            DataOutputStream datosSalidaPares = new DataOutputStream(flujoSalidaPares);
            DataOutputStream datosSalidaImpares = new DataOutputStream(flujoSalidaImpares);
            
            int tam = (int)datosEnterosUno.length()/4;
            System.out.print("\nNumeros enteros: ");
            for(int i = 1 ; i <=tam ; i++){
                int numero = datosEntradaUno.readInt();
                System.out.print(numero + " ");
                if(numero % 2 == 0){
                    datosSalidaPares.writeInt(numero);
                }else if(numero % 2 == 1){
                    datosSalidaImpares.writeInt(numero);
                }
            }
            datosEntradaUno.close();
            datosSalidaPares.close();
            datosSalidaImpares.close();
            
            FileInputStream flujoEntradaPares = new FileInputStream(datosEnterosPares);
            FileInputStream flujoEntradaImpares = new FileInputStream(datosEnterosImpares);
            
            DataInputStream datosEntradaPares = new DataInputStream(flujoEntradaPares);
            DataInputStream datosEntradaImpares = new DataInputStream(flujoEntradaImpares);
            
            int tamPares = (int)datosEnterosPares.length()/4;
            int tamImpares = (int)datosEnterosImpares.length()/4;
            
            if(tamPares != 0){
                System.out.print("\nNumeros pares: ");
                for(int i = 1 ; i <= tamPares ; i++){
                    int numero = datosEntradaPares.readInt();
                    System.out.print(numero + " ");
                }
            }
            
            if(tamImpares != 0){
                System.out.print("\nNumeros pares: ");
                for(int i = 1 ; i <= tamImpares ; i++){
                    int numero = datosEntradaImpares.readInt();
                    System.out.print(numero + " ");
                }
            }
            num = 0;
        }
    }
}
