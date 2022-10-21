package Empleado;
/**
 * Write a description of class EmpleadoTemporal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmpleadoTemporal extends Empleado
{
    public EmpleadoTemporal(int numero, String nombre, int antiguedad, double pagoPorHora, double horasTrabajadas){
        super(numero, nombre, antiguedad, pagoPorHora, horasTrabajadas);
    }
    
    public void calcularSueldo(){
        sueldo = getPagoPorHora() * getHorasTrabajadas() * 0.9;
    }
}
