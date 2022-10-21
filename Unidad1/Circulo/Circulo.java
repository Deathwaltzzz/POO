package Unidad1.Circulo;


/**
 * Write a description of class Circulo here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (15/feb/22)
 */
public class Circulo
{
    // variables de instancia
    private double radio; //this.radio

    /**
     * Constructor for objects of class Circulo
     */
    //Metodo constructor
    public Circulo()
    {
        // initialise instance variables
    }
    
    /**
     * Constructor para objetos de la clase Circulo que recibe el radio del parametro
     */
    //Metodo constructor
    public Circulo(double radio) //r
    {
        // initialise instance variables
        this.radio = radio; //Este radio es = al parametro de double radio
        //radio = r;
    }
    
    /**
     * Modificar el valor del radio del circulo
     *
     * @param double El nuevo valor del radio del circulo
     * @return void
     */
    public void setRadio(double radio)
    {
        // put your code here
        this.radio = radio;
    }
    
    /**
     * Consultar el valor del radio del circulo
     *
     * @param double El nuevo valor del radio del circulo
     * @return double El radio del circulo
     */
    public double getRadio()
    {
        // put your code here
        return radio;
    }
    
    /**
     * Calcular el area del circulo
     *
     * @param void
     * @return double El area del circulo
     */
    public double calcularArea()
    {
        // put your code here
        double area = Math.PI * Math.pow(radio, 2);
        //return Math.PI * Math.pow(radio, 2)
        return area;
    }
    
    /**
     * Calcular el perimetro del circulo
     *
     * @param void
     * @return double El perimetro del circulo
     */
    public double calcularCircunferencia()
    {
        return 2 * Math.PI * radio;
    }
    
    /**
     * Devolver la informacion del objeto en formato de cadena
     *
     * @param void
     * @return String
     */
    public String toString()
    {
        return "\nRadio: " + radio;
    }
}
