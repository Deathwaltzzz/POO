package Unidad5.Administracion_de_Excepciones;


/**
 * Write a description of class GestionExcepciones2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GestionDeExcepciones2
{
    public static void main(String[] args) throws Exception{
        LanzandoExcepciones objeto = new LanzandoExcepciones();
        /**
         * El metodo divideDosEnteros de la clase LanzandoExcepciones
         * expresa explicitamente (con la clausula throws Exception)
         * que se puede producir una excepcion y esto forza al metodo
         * que lo llama a hacerse responsable de manejar esa excepcion
         * ya sea capturandolo o propagandola
         */
        int resultado = objeto.divideDosEnteros(10,0);
        System.out.println("Resultado " + resultado);
    }
}
