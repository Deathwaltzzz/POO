package Unidad5.Administracion_de_Excepciones;
import javax.swing.JOptionPane;

/**
 * Write a description of class GestionDeExepciones5_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GestionDeExepciones5_2
{
    public static void main(String[] args){
        LanzandoExcepciones objeto = new LanzandoExcepciones();
        boolean error = true;
        double numero2 = 0;
        while(error){
            try{
                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Dame el divisor "));
                error = false;
            }catch( NumberFormatException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                error = true;
            }
            if(error==false){
                try{
                    double cociente = objeto.divideDosNumeros(5.4, numero2);
                    JOptionPane.showMessageDialog(null, "El cociente de la division es: "+ cociente);
                    error = false;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }
}
