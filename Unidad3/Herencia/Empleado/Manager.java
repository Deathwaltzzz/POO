package Unidad3.Herencia.Empleado;


/**
 * Write a description of class Manager here.
 * 
 * @author (your name) 
 * @version (22 de marzo del 2022)
 */
public class Manager extends Empleado
{
    protected String departament;
    public Manager(String nombre)
    {
        super (nombre);//Esta llamando al constructor de empleado
        //name = nombre;
    }
    public String getDepartament()
    {
        return departament;
    }
    public void setDepartament(String departament)
    {
        this.departament = departament;
    }
}
