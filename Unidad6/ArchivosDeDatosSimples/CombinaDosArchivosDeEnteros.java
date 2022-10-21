package Unidad6.ArchivosDeDatosSimples;
import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class CombinaDosArchivosDeEnteros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CombinaDosArchivosDeEnteros
{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        File datosEnterosUno = new File("C:DatosEnterosUno.dat");
        if(datosEnterosUno.exists()){
            System.out.println("El archivo uno existe!");
        }else{
            System.out.println("El archivo uno NO existe!");
        }
        FileOutputStream flujoSalidaUno = new FileOutputStream(datosEnterosUno);
        DataOutputStream flujoDatosSalidaUno = new DataOutputStream(flujoSalidaUno);
        File datosEnterosDos = new File("C:DatosEnterosDos.dat");
        if(datosEnterosDos.exists()){
            System.out.println("El archivo dos existe!");
        }else{
            System.out.println("El archivo dos NO existe!");
        }
        FileOutputStream flujoSalidaDos = new FileOutputStream(datosEnterosDos);
        DataOutputStream flujoDatosSalidaDos = new DataOutputStream(flujoSalidaDos);
        System.out.println("Cuantos numeros se van a usar");
        int num = sc.nextInt();
        while(num!=0){
            for(int i = 1 ; i <=num ; i++){
                System.out.println("Teclea el numero " + i);
                int nums = sc.nextInt();
                flujoDatosSalidaUno.writeInt(nums);
                flujoDatosSalidaDos.writeInt(nums);
            }
            flujoDatosSalidaUno.close();
            flujoDatosSalidaDos.close();

            FileInputStream flujoEntradaUno = new FileInputStream(datosEnterosUno);
            DataInputStream flujoDatosEntradaUno = new DataInputStream(flujoEntradaUno);

            FileInputStream flujoEntradaDos = new FileInputStream(datosEnterosDos);
            DataInputStream flujoDatosEntradaDos = new DataInputStream(flujoEntradaDos);

            File datosEnterosTres = new File("C:DatosEnterosTres.dat");
            if(datosEnterosTres.exists()){
                System.out.println("El archivo tres existe!");
            }else{
                System.out.println("El archivo tres no existe!");
            }
            FileOutputStream flujoSalidaTres = new FileOutputStream(datosEnterosTres);
            DataOutputStream flujoDatosSalidaTres = new DataOutputStream(flujoSalidaTres);
            int numUno, numDos, suma;
            int tam = (int)datosEnterosUno.length()/4;

            for(int i = 1 ; i <=tam ; i++){
                numUno = (flujoDatosEntradaUno.readInt());
                System.out.println("Numero  " + i + ": "+numUno);
                flujoDatosSalidaTres.writeInt(numUno);
                numDos = (flujoDatosEntradaDos.readInt());
                System.out.println("Numero  " + i + ": "+numDos);
                flujoDatosSalidaTres.writeInt(numDos);
            }
            flujoDatosEntradaUno.close();
            flujoDatosEntradaDos.close();
            flujoDatosSalidaTres.close();
            
            FileInputStream flujoEntradaTres = new FileInputStream(datosEnterosTres);
            DataInputStream flujoDatosEntradaTres = new DataInputStream(flujoEntradaTres);
            tam = (int)datosEnterosTres.length()/4;
            for(int i = 1 ; i <= tam ; i++){
                System.out.println("Numero " +i+": " + flujoDatosEntradaTres.readInt());
            }
            flujoDatosEntradaTres.close();
            num = 0;
        }
    }
}