package Empleado;
/**
 * Write a description of class EmpleadoManual here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmpleadoManual extends Empleado
{
    public EmpleadoManual(int numero, String nombre, int antiguedad, double pagoPorHora, double horasTrabajadas){
        super(numero, nombre, antiguedad, pagoPorHora, horasTrabajadas);  
    }
    
    public void calcularSueldo(){
        sueldo = getPagoPorHora() * getHorasTrabajadas() * 0.8;
    }
}
