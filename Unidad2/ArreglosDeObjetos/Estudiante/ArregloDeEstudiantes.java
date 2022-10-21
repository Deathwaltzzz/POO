package Unidad2.ArreglosDeObjetos.Estudiante;
;
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Write a description of class ArregloDeEstudiantes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArregloDeEstudiantes
{
    public static void muestraArreglo(Estudiante arreglo[] ){
        for(int i = 0 ; i<arreglo.length ; i++){
            if(arreglo[i] != null){
                JOptionPane.showMessageDialog(null, arreglo[i].toString());
            }
        }
    }

    public static void main(String[] args){
        // creacion de objetos
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);

        //atributos

        double cal1,cal2,cal3,promedio,suma=0,promedioGrupo;
        int numEst, i , mat;
        String nombre, nom;

        //leer datos de entrada

        System.out.print("Teclea tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("\nNumero de estudiantes: ");
        numEst = sc.nextInt();

        //declarar arreglo
        Estudiante[] arreglo;

        //crear arreglo
        arreglo = new Estudiante[numEst];

        //pedir los datos de los estudiantes y guardarlos en el arreglo
        for(i= 0 ; i<arreglo.length ; i++){
            System.out.print("Nombre del Estudiante ");
            nom = sc.next();
            System.out.print("Matricula ");
            mat = sc.nextInt();
            System.out.print("Calificacion 1 ");
            cal1 = sc.nextInt();
            System.out.print("Calificacion 2 ");
            cal2 = sc.nextInt();
            System.out.print("Calificacion 3 ");
            cal3 = sc.nextInt();

            if(arreglo[i] == null){
                arreglo[i] = new Estudiante(nom, mat);
                arreglo[i].setCalificacion1(cal1);
                arreglo[i].setCalificacion2(cal2);
                arreglo[i].setCalificacion3(cal3);
            }
        }//for

        //obtener el promedio por alumno y el promedio general del grupo
        for(i = 0 ; i < arreglo.length ; i++){
            promedio = arreglo[i].calculaPromedio();
            suma = suma + promedio;
            JOptionPane.showMessageDialog(null, arreglo[i].toString() + " el promedio es: "+ df.format(promedio));

            if(promedio<69){
                JOptionPane.showMessageDialog(null, "deficiente");
            }else if( promedio<80){
                JOptionPane.showMessageDialog(null, "Regular");
            }else if(promedio<90){
                JOptionPane.showMessageDialog(null, "Bueno");
            }else{
                JOptionPane.showMessageDialog(null, "Excelente");
            }
        }
        promedioGrupo = suma / numEst;
        JOptionPane.showMessageDialog(null, "Promedio del grupo " + df.format(promedioGrupo));
        // mostrar contenido arreglo
        
        muestraArreglo(arreglo);
        
        // asigna un 80 en la primer calificacion de cada alumno
        for(int indice = 0 ; indice<arreglo.length ; indice++){
            arreglo[indice].setCalificacion1(80);
        }
        
        // asignar a la segunda calificacion el valor de la primera
        // mas el valor del indice
        
        for(int indice = 0 ; indice<arreglo.length ; indice++){
            double cal = arreglo[indice].getCalificacion1();
            cal = cal + indice;
            arreglo[indice].setCalificacion2(cal);
            //arreglo[indice].setCalificacion2(arreglo[indice].getCaliifcacion1 + indice);
        }
        
        // asignar a la tercer calificacion el promedio de sus 2 primeras calificaciones
        
        for(int indice = 0 ; indice<arreglo.length ; indice++){
            arreglo[indice].setCalificacion3((arreglo[indice].getCalificacion1() +arreglo[indice].getCalificacion2())/2);
        }
        
        //mostrar contenido del arreglo
        muestraArreglo(arreglo);
        arreglo[0] = null;
        muestraArreglo(arreglo);
    }
}
