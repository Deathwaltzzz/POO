package Unidad2.ArreglosDeObjetos.Estudiante;



/**
 * Write a description of class Estudiante here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante
{
    private String nombre;
    private int matricula;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    
    public Estudiante(String nombre, int matricula){
        //Se inicializan las variables de instancia
        this.nombre = nombre;
        this.matricula = matricula;
        calificacion1 = 0.0;
        calificacion2 = 0.0;
        calificacion3 = 0.0;
    }
    
    public void setNombre(String nombre){
        if (nombre != null && nombre != ""){
            this.nombre = nombre;
        }
    }
    public void setMatricula(int matricula){
        if(matricula !=0){
            this.matricula = matricula;
        }
    }
    public void setCalificacion1(double calificacion){
        if (calificacion>= 0 && calificacion<=100){
            calificacion1 = calificacion;
        }
    }
    public void setCalificacion2(double calificacion){
        if (calificacion>= 0 && calificacion<=100){
            calificacion2 = calificacion;
        }
    }
    public void setCalificacion3(double calificacion){
        if (calificacion>= 0 && calificacion<=100){
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
    
    public double calculaPromedio(){
        return (calificacion1 + calificacion2 + calificacion3)/3.0;
    }
    
    public String toString(){
        return "Datos del estudiante" +
                "\nNombre del estudiante: " + nombre +
                "\nMatricula: " + matricula +
                "\nCalificacion 1: " + calificacion1 +
                "\nCalificacion 2: " + calificacion2 +
                "\nCalificacion 3: " + calificacion3;
    }
                
    }
