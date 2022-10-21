package Unidad3.Herencia.Empleado;


/**
 * Write a description of class CreaEmpleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreaEmpleado
{
    public static void main (String [] args)
    {
        Empleado Juan = new Empleado("Juan");
        
        Juan.setSalario(1234.50);
        System.out.println("Empleado " +Juan.getDetails());
        
        Manager Pedro = new Manager ("Pedro");
        Pedro.setDepartament("Deportes");
        //Juan.setDepartament("Alimentos");
        Pedro.setSalario(123.45);
        System.out.println("Adinistrador " +Pedro.getDetails() + "\nDepartamento " +Pedro.getDepartament());
        
        Empleado Luis = new Empleado("Luis");
        Luis.setSalario(2345.56);
        System.out.println("Empleado " +Luis.getDetails());
    }
}
