package Cuenta;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Write a description of class CuentaBancariaSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CuentaBancariaSwitch
{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("$.##");
        String menu = "1 Depositar" + 
            "\n2 Retirar" +
            "\n3 Consultar" +
            "\n4 Terminar";
        int opcion = 0, cuenta;
        String titular;
        double saldo = 0, monto;
        cuenta = Integer.parseInt(JOptionPane.showInputDialog("Numero de cuenta"));
        titular = JOptionPane.showInputDialog("Titular de la cuenta");
        while(opcion != 4){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){
                case 1:
                    monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a depositar"));
                    saldo+=monto;
                    break;
                case 2:
                    monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar"));
                    if(saldo >= monto){
                        saldo = saldo - monto;
                    }else{
                        JOptionPane.showMessageDialog(null,"No se hizo el retiro");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Titular " + titular + "\nCuenta: " + cuenta + "\nSaldo: "+ df.format(saldo));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Introduzca una opcion valida");
            }
        }
    }
}