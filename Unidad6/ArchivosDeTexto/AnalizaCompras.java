package Unidad6.ArchivosDeTexto;
import java.util.*;
import java.io.*;

/**
 * Write a description of class AnalizaCompras here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnalizaCompras
{
    public static void main(String[] args)throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        File movCompras = new File("MovCompras.txt");
        FileOutputStream flujoSalida = new FileOutputStream(movCompras);
        PrintWriter archivoTxt = new PrintWriter(flujoSalida);

        int numRef = 1;
        String nomRef;
        double cantidad;
        double costo;
        char tipoRef;
    
        while(numRef>0){
            System.out.println("Numero de refaccion");
            numRef = sc.nextInt();
            if(numRef>0){
                System.out.println("Nombre de refaccion");
                nomRef = sc.next();
                System.out.println("Cantidad comprada");
                cantidad = sc.nextDouble();
                System.out.println("Costo unitario");
                costo = sc.nextDouble();
                System.out.println("Tipo de refaccion A o B");
                tipoRef = sc.next().charAt(0);
                archivoTxt.println(numRef+" "+nomRef+" "+cantidad+" "+costo+" "+tipoRef);
            }
        }
        archivoTxt.close();
        
        FileReader flujoEntrada = new FileReader(movCompras);
        BufferedReader lectorBuffer = new BufferedReader(flujoEntrada);
        
        File comprasTipoA = new File("ComprasTipoA.txt");
        FileOutputStream flujoEntradaA = new FileOutputStream(comprasTipoA);
        PrintWriter archivoTxtA = new PrintWriter(flujoEntradaA);
        
        File comprasTipoB = new File("ComrasTipoB.txt");
        FileOutputStream flujoEntradaB = new FileOutputStream(comprasTipoB);
        PrintWriter archivoTxtB = new PrintWriter(flujoEntradaB);
    }
}

