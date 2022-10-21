package Unidad5.Administracion_de_Excepciones;

import javax.swing.JOptionPane;
/**
 * Write a description of class LanzandoExcepciones here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (4/26/22)
 */
public class LanzandoExcepciones
{
    public LanzandoExcepciones(){
        
    }
    
    //en forma implicita
    public int divideEntreCero(int numero){
        return numero/0;
        /**
         * ocurre el error, java crea un objeto con los datos del 
         * error y se lanza el objeto, esperando que alguien lo atrape para que el programa
         * no termine en forma abrupta.
         */
    }
    //en forma implicita y solo probable
    public int divideDosEnteros(int numero1, int numero2)throws Exception{
        /**
         * Se conoce que al dividir numero1 por numero2, podria presentarse
         * el casode que numero2 sea cero, lo que produciria un error y por ello se anuncia en 
         * el encabezado del metodo que podria producirse un error, este anuncio se logra con
         * "throws Exception"
         */
        return numero1/numero2;
        /**
         * Si el numero 2 vale cero, entonces ocurre un error, java crea un objeto y lo lanza
         * en espera que alguien lo atrape y maneje.
         */
    }
    //en forma implicita y probable
    public void leerNumero() throws NumberFormatException, Exception{
        String cadenaEntrada = JOptionPane.showInputDialog("Numero ");
        int numero = Integer.parseInt(cadenaEntrada);
    }
    
    // en forma explicita - sentencia "throw"
    public double divideDosNumeros(double numero1, double numero2) throws Exception{
        if(numero2 != 0){
            return numero1/numero2;
        }else{
            Exception e = new Exception("No se puede dividir entre cero");
            throw e;
            /**
             * las dos sentencias anteriores pueden reemplazarse en una sola: 
             * throw new Exception("NO se puede dividir entre cero");
             */
            //En cualquiera de las 2 formas el programador esta creando y lanzando
            //el objeto asociado con la exepcion
        }
    }
}
