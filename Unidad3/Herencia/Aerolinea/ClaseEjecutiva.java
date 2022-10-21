package Unidad3.Herencia.Aerolinea;


/**
 * Write a description of class ClaseEjecutiva here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClaseEjecutiva extends Aerolinea
{
   private int puntosAcumulados;
    public ClaseEjecutiva(String nombre, int puntosAcumulados){
       super(nombre);
       this.puntosAcumulados = puntosAcumulados;
   }
   
   public void calculaImporte(){
       importe = getKgEquipaje() * getPrecioKg() * getPrecioBoleto() + 1.10;
   }
}
