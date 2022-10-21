package Unidad3.Herencia.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Write a description of class AplicacionPersona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AplicacionPersona
{
    public static void muestraArreglo(Persona arregloPersonas[]){
        for(int i = 0 ; i < arregloPersonas.length ; i++){
            if(arregloPersonas[i] != null){
                JOptionPane.showMessageDialog(null, arregloPersonas[i].toString());
            }
        }
    }
    
    public static void main(String[] args){
        //variables
        String nombre;
        int edad;
        double promedio;
        double salario;
        
        Scanner sc = new Scanner(System.in);
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo"));
        
        Persona [] arregloPersonas = new Persona[tam];
        
        int opc = 1;
        int conta = 0;
        String menu = "\n1 Persona " +
                      "\n2 Estudiante " +
                      "\n3 Empleado " + 
                      "\n4 Mostrar " +
                      "\n5 Terminar";
        while (opc != 5){
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(opc!=5){
                if(opc == 4){
                    muestraArreglo(arregloPersonas);
                }else{
                    if(conta < tam){ //Valida que el arreglo tenga espacio para agregar
                        nombre = JOptionPane.showInputDialog("Introduce un nombre");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
                        if(opc == 1){ //Creador de objetos persona
                            arregloPersonas[conta] = new Persona(nombre, edad);
                            conta++;
                        }else if(opc == 2){ //Creador de objetos Esudiante
                            promedio = Double.parseDouble(JOptionPane.showInputDialog("Promedio"));
                            arregloPersonas[conta] = new Estudiante(nombre, edad, promedio);
                            conta++;
                        }else if(opc == 3){ //Creador de objetos Empleado
                            salario = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
                            arregloPersonas[conta] = new Empleado(nombre, edad, salario);
                            conta++;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "No queda espacio en el arreglo");
                    }
                } // si es diferente de 4
            }//si es diferente de 5
        }//while
    }//main
}//clase
