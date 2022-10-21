package Modularidad.Cuenta;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * Write a description of class CuentaBancaria here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (08/02/22)
 */
public class CuentaBancaria
{
    public static double depositar(double monto, double saldo){
        saldo += monto;
        return saldo;
    }
    
    public static double retirar(double monto, double saldo){
        if(saldo >= monto){
            saldo -= monto;
        }else{
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        }
        return saldo;
    }
    
    public static void consultar(int cuenta, String titular, double saldo){
        DecimalFormat df = new DecimalFormat("$.##");
        JOptionPane.showMessageDialog(null, "Titular: " + titular + "\nCuenta: " + cuenta + "\nSaldo: " + df.format(saldo));
    }
    
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("$.##");
        String menu = "1 Depositar" + "\n2 Retirar" + "\n3 Consultar" + "\n4 Terminar";
        int opcion = 0, cuenta;
        String titular;
        double saldo = 0, monto;
        cuenta = Integer.parseInt(JOptionPane.showInputDialog("Numero de cuenta"));
        titular = JOptionPane.showInputDialog("Titular de cuenta");
        //Ciclo principal
        while(opcion !=4){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(opcion == 1){
                monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a depositar"));
                saldo = depositar(monto, saldo);
            }else if(opcion == 2){
                monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar"));
                saldo = retirar(monto,saldo);
            }else if(opcion == 3){
                consultar(cuenta, titular, saldo);
            }
        }//While
    }//Main
}//Clase
