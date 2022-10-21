package Unidad6.ArchivosDeObjetos.Estudiante;
import java.io.*;

/**
 * Write a description of class Estudiante here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (03/02/22)
 */
public class Estudiante implements Serializable
// se implementa una interface serializable, que permite
// escribir objetos de la clase en un archivo
{
    private String nombre;
    private int matricula;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    
    public Estudiante(String nombre, int matricula){
        this.nombre = nombre;
        this.matricula = matricula;
        calificacion1 = 0.0;
        calificacion2 = 0.0;
        calificacion3 = 0.0;
    }
    
    public double calculaPromedio(double cal1, double cal2, double cal3){
        //se inicializan las variables de instancia
        calificacion1 = cal1;
        calificacion2 = cal2;
        calificacion3 = cal3;
        double suma = cal1 + cal2 + cal3;
        double promedio = suma/3.0;
        return promedio;
    }
    
    public void setNombre(String nombre){
        if(nombre!=null && nombre != ""){
            this.nombre = nombre;
        }
    }
    
    public void setMatricula(int matricula){
        if(matricula !=0){
            this.matricula = matricula;
        }
    }
    
    public void setCalificacion1(double calificacion){
        if(calificacion >=0 && calificacion <=100){
            calificacion1 = calificacion;
        }
    }
    
    public void setCalificacion2(double calificacion){
        if(calificacion >=0 && calificacion <=100){
            calificacion2 = calificacion;
        }
    }
    
    public void setCalificacion3(double calificacion){
        if(calificacion >=0 && calificacion <=100){
            calificacion3 = calificacion;
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public double getCalificacion1(){
        return calificacion1;
    }
    
    public double getCalificacion2(){
        return calificacion2;
    }
    
    public double getCalificacion3(){
        return calificacion3;
    }
    
    public double calculaPromedioAritmetico(){
        return (calificacion1 + calificacion2 + calificacion3)/3.0;
    }
    
    public String toString(){
        return ("Datos del estudiante " + "\nNombre " + nombre + "\nMatricula " + matricula + "\nCalificacion 1 " + calificacion1 + "\nCalificacion 2 " + calificacion2 +
                "\nCalificacion 3 " + calificacion3);
    }
}

