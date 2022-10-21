package Unidad6.ArchivosDeTexto;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

/**
 * Write a description of class CalculaSaldoCuenta here.
 * a) Crear un archivo de texto
 * b) Escribir en el archivo registros que nos indiquen los movimientos (Depositos y retiros)
 * a una cuenta bancaria
 * c) Cerrar el archivo
 * D) Abrirlo de lectura
 * e) Leer los registros e ir calculando el saldo de la cuenta
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculaSaldoCuenta
{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File archivoMovCuenta = new File("MovCuenta.txt");
        FileOutputStream flujoSalida = new FileOutputStream(archivoMovCuenta);
        PrintWriter archivoTxt = new PrintWriter(flujoSalida);

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$.##");

        int numCuenta;
        double monto, saldo = 0;

        boolean continuar = false;
        String tipoMov;
        char tipoMovChar;

        System.out.println("Numero de cuenta");
        numCuenta = sc.nextInt();

        do{
            System.out.println("Tipo movimiento (R)etiro (D)eposito");
            tipoMov = sc.next();
            tipoMovChar = tipoMov.charAt(0);

            System.out.println("Monto del movimiento");
            monto = sc.nextInt();
            //sc.nextLine();
            archivoTxt.println(numCuenta+" "+tipoMovChar+" "+monto);
            System.out.println("1) Continuar 2) Terminar");
            int opc = sc.nextInt();
            sc.nextLine();
            if(opc == 1){
                continuar = true;
            }else{
                continuar = false;
            }
        }while(continuar);
        archivoTxt.close();

        FileReader lectorArchivo = new FileReader(archivoMovCuenta);
        BufferedReader bufferLectura = new BufferedReader(lectorArchivo);

        String linea = "";
        while(linea !=null){
            linea = bufferLectura.readLine();
            if(linea !=null){
                System.out.println("\n" + linea);
                
                StringTokenizer analizador = new StringTokenizer(linea);
                String numCuentaS = analizador.nextToken();
                numCuenta = Integer.parseInt(numCuentaS);
                
                tipoMov = analizador.nextToken();
                tipoMovChar = tipoMov.charAt(0);
                
                String montoS = analizador.nextToken();
                monto = Double.parseDouble(montoS);
                
                if(tipoMovChar == 'D'){
                    saldo = saldo + monto;
                }else{
                    saldo = saldo - monto;
                }
                System.out.println("\nNumero de cuenta " + numCuenta);
                System.out.println("Tipo de movimiento " + tipoMov);
                System.out.println("Monto " + monto);
                
            }//if
        }//while
        System.out.println("Saldo de la cuenta " + df.format(saldo));
        archivoTxt.close();
    }
}
