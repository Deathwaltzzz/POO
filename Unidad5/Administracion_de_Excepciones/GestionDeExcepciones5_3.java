package Unidad5.Administracion_de_Excepciones;
import javax.swing.JOptionPane;

/**
 * Write a description of class GestionDeExcepciones5_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GestionDeExcepciones5_3
{
    public static void main(String[] args){
        LanzandoExcepciones objeto = new LanzandoExcepciones();
        boolean error = true;
        double numero2;
        while(error){
            try{
                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Dame el divisor "));
                double cociente = objeto.divideDosNumeros(5.4, numero2);
                JOptionPane.showMessageDialog(null, "El cociente de la divison es: " + cociente);
                error = false;
            }catch ( NumberFormatException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                error = true;
            }catch( Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                error = true;
            }
        }
    }
}
