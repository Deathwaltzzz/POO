package Cuenta;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Write a description of class Cuenta_Bancaria here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (2 feb 2022)
 */
public class Cuenta_Bancaria
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
            if(opcion == 1){
                monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a depositar"));
                //Saldo = saldo + monto
                saldo+=monto;
            }else
                if (opcion == 2){
                    monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar"));
                    if(saldo >= monto){
                        saldo = saldo - monto;
                    }else{
                        JOptionPane.showMessageDialog(null,"No se hizo el retiro");
                    }
                }else if(opcion == 3){
                    JOptionPane.showMessageDialog(null, "Titular " + titular + "\nCuenta: " + "\nSaldo: "+ df.format(saldo));  
                }   
            }
        }
    }
