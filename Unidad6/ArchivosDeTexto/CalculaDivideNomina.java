package Unidad6.ArchivosDeTexto;
import java.io.*;
import java.util.*;

/**
 * Write a description of class CalculaDivideNomina here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculaDivideNomina
{
    public static void main(String[] args)throws FileNotFoundException, IOException{
        File movNomina = new File("MovNomina.txt");
        FileOutputStream flujoSalida = new FileOutputStream(movNomina);
        PrintWriter archivoTxt = new PrintWriter(flujoSalida);
        
        int mov;
        String nombre;
        int numero=1;
        double horasTrab;
        double sueldo;
        String generoS;
        char genero;
        
        Scanner sc = new Scanner(System.in);
        
        while(numero != 0){
            System.out.println("Numero de empleado o 0 para terminar");
            numero = sc.nextInt();
            if(numero != 0){
                System.out.println("Nombre de empleado");
                nombre = sc.next();
                System.out.println("Horas trabajadas");
                horasTrab = sc.nextDouble();
                System.out.println("(F)emenino o (M)asculino");
                generoS = sc.next();
                genero = generoS.charAt(0);
                
                archivoTxt.println(numero+" "+nombre+" "+horasTrab+" "+genero+" ");
            }
            
        }
        archivoTxt.close();
        
        FileReader lectorArchivo = new FileReader(movNomina);
        BufferedReader lectorBuffer = new BufferedReader(lectorArchivo);
        
        File nominaF = new File("NominaF.txt");
        FileOutputStream flujoSalidaF = new FileOutputStream(nominaF);
        PrintWriter archivoTxtF = new PrintWriter(flujoSalidaF);
        
        File nominaM = new File("NominaM.txt");
        FileOutputStream flujoSalidaM = new FileOutputStream(nominaM);
        PrintWriter archivoTxtM = new PrintWriter(flujoSalidaM);
        
        
        
        String linea = "";
        while(linea!= null){
            linea = lectorBuffer.readLine();
            if(linea!=null){
                sueldo = 0;
                System.out.println("\n" + linea);
                
                StringTokenizer analizador = new StringTokenizer(linea);
                
                String numCuentaS = analizador.nextToken();
                numero = Integer.parseInt(numCuentaS);
                
                nombre = analizador.nextToken();
                
                String horasTrabS = analizador.nextToken();
                horasTrab = Double.parseDouble(horasTrabS);
                
                generoS = analizador.nextToken();
                genero = generoS.charAt(0);
                
                sueldo = horasTrab * 45;
                
                if(genero == 'F'){
                    archivoTxtF.println(numero+" "+nombre+" "+horasTrab+" "+genero+" "+sueldo);
                }else{
                    archivoTxtM.println(numero+" "+nombre+" "+horasTrab+" "+genero+" "+sueldo);
                }
            }
        }
        archivoTxtF.close();
        archivoTxtM.close();
        archivoTxt.close();
        
        FileReader lectorF = new FileReader(nominaF);
        BufferedReader lectorBufferF = new BufferedReader(lectorF);
        
        FileReader lectorM = new FileReader(nominaM);
        BufferedReader lectorBufferM = new BufferedReader(lectorM);
        
        linea = "";
        System.out.println("Empleados: ");
        while(linea!=null){
            linea = lectorBuffer.readLine();
            if(linea!=null){
                System.out.println("\n" + linea);
            }
        }
        linea = "";
        System.out.println("Empleados femeninos: ");
        while(linea!=null){
            linea = lectorBufferF.readLine();
            if(linea!=null){
                System.out.println("\n" + linea);
            }
        }
        linea = "";
        System.out.println("\nEmpleados masculinos: ");
        while(linea!=null){
            linea = lectorBufferM.readLine();
            if(linea!=null){
                System.out.println("\n" + linea);
            }
        }
    }
}
