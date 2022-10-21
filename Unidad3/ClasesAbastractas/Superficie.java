package Unidad3.ClasesAbastractas;


/**
 * Abstract class Superficie, no se pueden crear objetos de esta clase
 * No es una clase instanciable
 * @author: 
 * Date: 
 */
public abstract class Superficie
{
    protected double area;
    
    public Superficie()
    {
        
    }
    
    //Este metodo define como abstarcto, NO tiene cuerpo,
    //esto obliga a las clases que heredan de Superficie+
    //a crear un metodo calculaArea() que si tenga cuerpo
    public abstract void calculaArea();
    
    public double getArea()
    {
        return area;
    }
    public abstract String toString();
}
