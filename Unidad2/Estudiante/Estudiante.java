package Unidad2.Estudiante;


/**
 * Write a description of class Estudiante here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (03/02/22)
 */
public class Estudiante
{
    private String nombre;
    private int matricula;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    
    public Estudiante(String nombre, int matricula){
        this.nombre = nombre;
        this.matricula = matricula;
    }
    
    public double calculaPromedio(double cal1, double cal2, double cal3){
        calificacion1 = cal1;
        calificacion2 = cal2;
        calificacion3 = cal3;
        double suma = cal1 + cal2 + cal3;
        double promedio = suma/3.0;
        return promedio;
    }
    
    public String toString(){
        return ("Nombre " + nombre + "\nMatricula " + matricula + "\nCalificacion 1 " + calificacion1 + "\nCalificacion 2 " + calificacion2 +
                "\nCalificacion 3 " + calificacion3);
    }
}
