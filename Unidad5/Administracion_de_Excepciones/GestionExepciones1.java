package Unidad5.Administracion_de_Excepciones;


/**
 * Write a description of class GestionExepciones1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GestionExepciones1
{
    public static void main(String[] args){
        LanzandoExcepciones objeto = new LanzandoExcepciones();
        
        //llamar a un merodo inicia la posibilidad de que se produzca una excepcion
        objeto.divideEntreCero(10);
    }
}
