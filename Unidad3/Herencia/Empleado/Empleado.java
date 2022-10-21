package Unidad3.Herencia.Empleado;
import java.util.Date;

/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado
{
    private String name;
    private double salario;
    protected Date birthDate;
    public Empleado(String name)
    {
        this.name = name;
    }
    public Empleado()
    {
        
    }
    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    public double getSalario()
    {
        return salario;
    }
    public String getDetails()
    {
        return "Name: " + name+ "\nSalary: " +salario;
    }
}
