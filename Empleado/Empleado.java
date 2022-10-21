package Empleado;
/**
 * Write a description of class Empleado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Empleado
{
    private int numero;
    protected String nombre;
    protected int antiguedad;
    private double pagoPorHora, horasTrabajadas;
    protected double sueldo;
    
    public Empleado(int numero, String nombre, int antiguedad, double pagoPorHora, double horasTrabajadas){
        this.numero = numero;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public int getNumero(){
        return numero;
    }
    public double getPagoPorHora(){
        return pagoPorHora;
    }
    public double getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public String mostrarEmpleado(){
        return "Nombre del empleado: " + nombre +"\nNumero de empleado: " + numero + "\nAntiguedad: " + antiguedad + "\nPago por hora: " + pagoPorHora + "\nHoras trabajadas: "
        + horasTrabajadas + "\nSueldo: " + sueldo;
    }
    
    public abstract void calcularSueldo();
    
}
