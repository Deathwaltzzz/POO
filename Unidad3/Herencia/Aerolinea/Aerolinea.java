package Unidad3.Herencia.Aerolinea;


/**
 * Write a description of class Aerolinea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aerolinea
{
    private String nombre;
    private double kgEquipaje, precioBoleto, precioKg;
    protected double importe;
    
    public Aerolinea(String nombre){
        this.nombre = nombre;
    }
    
    public void setKgEquipaje(double kgEquipaje){
        this.kgEquipaje = kgEquipaje;
    }
    public void setPrecioKg(double precioKg){
        this.precioKg = precioKg;
    }
    public void setPrecioBoleto(double precioBoleto){
        this.precioBoleto = precioBoleto;
    }
    
    public double getKgEquipaje(){
        return kgEquipaje;
    }
    public double getPrecioKg(){
        return precioKg;
    }
    public double getPrecioBoleto(){
        return precioBoleto;
    }
    
    public String toString(){
        return ("Nombre aerolinea " + nombre + "\nKilogramo equipaje " + kgEquipaje + "\nPrecio x kg " + precioKg +
                "\nPrecio boleto " + precioBoleto + "\nimporte " + importe);
    }
}

