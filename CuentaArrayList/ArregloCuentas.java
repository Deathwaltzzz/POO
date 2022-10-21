package CuentaArrayList;


import java.util.ArrayList; //Import del arraylist
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
        ArrayList<Cuenta> cuenta = new ArrayList<Cuenta>(); //declaracion del arraylist tipo Cuenta
        int numeroCuenta;
        String titular;
        int cont=0;
        double saldo, monto;
        String menu = "1) Crear cuenta \n2) Depositar \n3) Retirar \n4) Consultar cuenta \n5) Borrar cuenta \n6) Consultar todas \n7) Terminar";
        int option = 0;
        boolean conf=false;
        while(option!= 7){ //Ciclo principal
            option = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (option){
                case 1:
                    conf = false;
                    if(cont == 0){
                        numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de cuenta"));
                        titular = JOptionPane.showInputDialog("Introduzca el titular de la cuenta ");
                        saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el saldo de la cuenta "));
                        cuenta.add(new Cuenta(numeroCuenta, titular, saldo)); //nombre del array.add para agregar elementos en el arraylist
                        cont++;
                    }else{
                        numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de cuenta"));
                        for(int i = 0 ; i < cuenta.size() && !conf ; i++){
                            if(cuenta.get(i).getNumeroCuenta() == numeroCuenta){
                                JOptionPane.showMessageDialog(null, "Este numero de cuenta ya esta registrado!");
                                conf = true;
                            }else{
                                titular = JOptionPane.showInputDialog("Introduzca el titular de la cuenta ");
                                saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el saldo de la cuenta "));
                                cuenta.add(new Cuenta(numeroCuenta, titular, saldo));
                                cont ++;
                                conf = true;
                            }
                        }
                    }
                    cont = cont;
                    break;
                case 2:
                    conf = false;
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta"));
                    for(int i = 0 ; i < cuenta.size() && conf!=true ; i++){
                        if(numeroCuenta == cuenta.get(i).getNumeroCuenta()){
                            monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a depositar"));
                            conf = true;
                            cuenta.get(i).depositar(monto); //nombre.get(index) para obtener la posicion especifica + el metodo de la clase Cuenta.
                        }
                    }
                    if(!conf){
                        JOptionPane.showMessageDialog(null, "No se encontro el numero de cuenta");
                    }
                    break;
                case 3:
                    conf = false;
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta"));
                    for(int i = 0 ; i < cuenta.size() && conf!=true ; i++){
                        if(numeroCuenta == cuenta.get(i).getNumeroCuenta()){ //nombre.get(index) para obtener la posicion especifica + el metodo de la clase Cuenta.
                            monto = Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar"));
                            conf = true;
                            if(cuenta.get(i).retirar(monto)){
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
                    for(int i = 0 ; i < cuenta.size() && conf!=true ; i++){
                        if(numeroCuenta == cuenta.get(i).getNumeroCuenta()){
                            JOptionPane.showMessageDialog(null, cuenta.get(i).toString());
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
                    for(int i = 0 ; i < cuenta.size() && conf!=true ; i++){
                        if(numeroCuenta == cuenta.get(i).getNumeroCuenta()){
                            String confirmacion = JOptionPane.showInputDialog("Desea borrar la cuenta " + "\n" + cuenta.get(i).toString() + " ? \nteclee s para confirmar, n para cancelar");
                            conf = true;
                            if(confirmacion.toLowerCase().equals("s")){
                                cuenta.remove(cuenta.get(i)); //nombre del arreglo.remove para remover un objeto(nombre.get(index) para borrar este elemento especifico)
                                JOptionPane.showMessageDialog(null, "Se ha borrado la cuenta exitosamente");
                                cont--;
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
                    for(int i = 0 ; i < cuenta.size() ; i++){
                        JOptionPane.showMessageDialog(null, cuenta.get(i).toString()); //metodo toString con el cuenta.get(index)
                    }
                    break;
            }
        }
    }
}
