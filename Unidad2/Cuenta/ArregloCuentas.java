package Unidad2.Cuenta;


import javax.swing.JOptionPane;

/**
 * Write a description of class ArregloCuentas here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (a version number or a date)
 */
public class ArregloCuentas
{
    public static void main(String[] args){
        Cuenta[] cuenta;
        int numeroCuenta;
        String titular;
        double saldo, monto;
        String menu = "1) Crear cuenta \n2) Depositar \n3) Retirar \n4) Consultar cuenta \n5) Borrar cuenta \n6) Consultar todas \n7) Terminar";
        int arrCuen = Integer.parseInt(JOptionPane.showInputDialog( "Introduzca las cuentas que se desean crear"));
        cuenta = new Cuenta[arrCuen];
        int option = 0;
        boolean conf=false;
        while(option!= 7){
            option = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (option){
                case 1:
                    conf = false;
                    for(int i = 0 ; i < cuenta.length ; i++){
                        if(cuenta[i] == null){
                            numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de cuenta de la cuenta " + (i+1)));
                            titular = JOptionPane.showInputDialog("Introduzca el titular de la cuenta " + (i+1));
                            saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el saldo de la cuenta " + (i+1)));
                            cuenta[i] = new Cuenta(numeroCuenta, titular, saldo);
                            conf = true;
                        }
                    }
                    if(conf == false){
                        JOptionPane.showMessageDialog(null, "No queda espacio en el arreglo!");
                    }
                    break;
                case 2:
                    conf = false;
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta"));
                    for(int i = 0 ; i < cuenta.length && conf!=true ; i++){
                        if(cuenta[i] != null && numeroCuenta == cuenta[i].getNumeroCuenta()){
                            monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a depositar"));
                            conf = true;
                            cuenta[i].depositar(monto);
                        }
                    }
                    if(!conf){
                        JOptionPane.showMessageDialog(null, "No se encontro el numero de cuenta");
                    }
                    break;
                case 3:
                    conf = false;
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta"));
                    for(int i = 0 ; i < cuenta.length && conf!=true ; i++){
                        if(numeroCuenta == cuenta[i].getNumeroCuenta()){
                            monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar"));
                            conf = true;
                            if(cuenta[i].retirar(monto)){
                                JOptionPane.showMessageDialog(null, "El retiro fue exitoso");
                            }else{
                                JOptionPane.showMessageDialog(null, "No se pudo realizar el retiro, compruebe su saldo");
                            }
                        }
                    }
                    if(!conf){
                        JOptionPane.showMessageDialog(null, "No se encontro el numero de cuenta");
                    }
                    break;
                case 4:
                    conf = false;
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta"));
                    for(int i = 0 ; i < cuenta.length && conf!=true ; i++){
                        if(numeroCuenta == cuenta[i].getNumeroCuenta()){
                            JOptionPane.showMessageDialog(null, cuenta[i].toString());
                            conf = true;
                        }
                    }
                    if(!conf){
                        JOptionPane.showMessageDialog(null, "No se encontro el numero de cuenta");
                    }
                    break;
                case 5:
                    conf = false;
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta"));
                    for(int i = 0 ; i < cuenta.length && conf!=true ; i++){
                        if(numeroCuenta == cuenta[i].getNumeroCuenta()){
                            String confirmacion = JOptionPane.showInputDialog("Desea borrar la cuenta " + cuenta[i].getNumeroCuenta() + " ? teclee s para confirmar, n para cancelar");
                            conf = true;
                            if(confirmacion.toLowerCase().equals("s")){
                                cuenta[i] = null;
                                JOptionPane.showMessageDialog(null, "Se ha borrado la cuenta exitosamente");
                            }else if(confirmacion.toLowerCase().equals("n")){
                                JOptionPane.showMessageDialog(null, "Se ha cancelado la operacion!");
                            }else{
                                JOptionPane.showMessageDialog(null, "Seleccione una opcion valida!");
                            }
                        }
                    }
                    if(!conf){
                        JOptionPane.showMessageDialog(null, "No se encontro el numero de cuenta");
                    }
                    break;
                case 6:
                    for(int i = 0 ; i < cuenta.length ; i++){
                        if(cuenta[i]!=null){
                            JOptionPane.showMessageDialog(null, cuenta[i].toString());
                        }
                    }
                    break;
            }
        }
    }
}
