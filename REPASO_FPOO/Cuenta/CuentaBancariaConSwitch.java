package Cuenta;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 * Write a description of class CuentaBancariaConSwitch here.
 *
 * @author (Leonardo Contreras Martínez)
 * @version (04 Feb 2022)
 */
public class CuentaBancariaConSwitch
{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat ("$.##");
        String menu =  "1 Depositar "+
            "\n2 Retirar "+
            "\n3 Consultar "+
            "\n4 Terminar ";
        int opcion = 0, cuenta;
        String titular;
        double saldo = 0, monto;
        cuenta = Integer.parseInt(JOptionPane.showInputDialog("Numero de cuenta "));
        titular = JOptionPane.showInputDialog("Titular de la cuenta ");

        // Ciclo principal
        while(opcion != 4){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch( opcion ){
                case 1 :
                    monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a Depositar "));
                    saldo = saldo + monto;
                    break;
                case 2 :
                    monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar"));
                    if(saldo >= monto){
                        saldo -= monto;
                    }else{
                        JOptionPane.showMessageDialog(null,"No se hizo el retiro");
                        break;
                    }
                case 3 : 
                    JOptionPane.showMessageDialog(null,"Titular "+ titular +
                        "\nCuenta "+ cuenta+
                        "\nSaldo"+ df.format(saldo));
                        break;
            }
        }
    }
}
