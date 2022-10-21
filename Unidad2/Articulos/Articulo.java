package Unidad2.Articulos;

/**
 * Write a description of class Articulo here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (2/28/22)
 */
public class Articulo
{
    private int clave;
    private String descripcion;
    private double precio;

    //metodo constructor

    public Articulo(int clave, String descripcion, double precio){
        this.clave = clave;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void setClave(int clave){
        this.clave = clave;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public int getClave(){
        return clave;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }
    //este metodo compara si dos articulos son iguales
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if (!obj.getClass().equals(this.getClass())){ //get class compara si las clases son iguales u objetos
            return false;
        }
        Articulo art = (Articulo)obj; //Convierte el articulo obj en un articulo llamado art
        if(this.clave == art.clave&&this.descripcion.equals(art.descripcion)){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return ("Clave " + clave + "\nDescripcion " + descripcion + "\nPrecio " + precio);
    }
}
