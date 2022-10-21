package Unidad2.ArreglosDeObjetos.Articulos;

/**
 * Write a description of class Articulo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Articulo
{
    private String clave;
    private String descripcion;
    private double precio;

    //metodo constructor
    public Articulo(String clave, String descripcion, double precio){
        this.clave = clave;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void setClave(String clave){
        this.clave = clave;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getClave(){
        return clave;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if(!obj.getClass().equals(this.getClass())){
            return false;
        }
        Articulo art = (Articulo)obj;
        if(this.clave == (art.clave) && this.descripcion == (art.descripcion)){
            return true;
        }
        return false;
    }
}

