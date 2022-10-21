package Unidad3.Herencia.Aerolinea;


/**
 * Write a description of class ClaseTurista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClaseTurista extends Aerolinea
{
    private int millasAcumuladas;
    public ClaseTurista(String nombre, int millasAcumuladas){
        super(nombre);
        this.millasAcumuladas = millasAcumuladas;
    }
    
    public void calculaImporte(){
        importe = ((getKgEquipaje() * getPrecioKg())*1.1) + (getPrecioBoleto() * 1.12);
    }
}
