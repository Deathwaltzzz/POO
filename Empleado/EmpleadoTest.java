package Empleado;

import javax.swing.JOptionPane;

/**
 * Write a description of class EmpleadoTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmpleadoTest
{
    public static void main(String[] args){
        int numero, antiguedad,numEmpleados;
        double pagoPorHora, horasTrabajadas;
        String nombre;
        int opc = 0;
        boolean conf = false;
        numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Trabajadores a registrar"));

        Empleado[] arrEmpleado = new Empleado[numEmpleados];

        String menu = "1) Empleado docente \n2) Empleado temporal \n3) Empleado Manual \n4) Mostrar empleados \n5) Borrar empleado \n6) Terminar";

        while(opc !=6){
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(opc!=6){
                switch(opc){
                    case 1:
                        conf = false;
                        for(int i = 0 ; i<arrEmpleado.length ; i++){
                            if(arrEmpleado[i] == null){
                                if(!conf){
                                    numero = Integer.parseInt(JOptionPane.showInputDialog("Numero de empleado"));
                                    nombre = JOptionPane.showInputDialog("Nombre de empleado");
                                    antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Antiguedad de empleado"));
                                    pagoPorHora = Double.parseDouble(JOptionPane.showInputDialog("Pago por hora"));
                                    horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Horas trabajadas"));
                                    arrEmpleado[i] = new EmpleadoDocente(numero, nombre, antiguedad, pagoPorHora, horasTrabajadas);
                                    arrEmpleado[i].calcularSueldo();
                                    conf = true;
                                }
                            }
                        }
                        if(!conf){
                            JOptionPane.showMessageDialog(null, "No queda espacio en el arreglo!");
                        }
                        break;
                    case 2:
                        conf = false;
                        for(int i = 0 ; i<arrEmpleado.length ; i++){
                            if(arrEmpleado[i] == null){
                                if(!conf){
                                    numero = Integer.parseInt(JOptionPane.showInputDialog("Numero de empleado"));
                                    nombre = JOptionPane.showInputDialog("Nombre de empleado");
                                    antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Antiguedad de empleado"));
                                    pagoPorHora = Double.parseDouble(JOptionPane.showInputDialog("Pago por hora"));
                                    horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Horas trabajadas"));
                                    arrEmpleado[i] = new EmpleadoTemporal(numero, nombre, antiguedad, pagoPorHora, horasTrabajadas);
                                    arrEmpleado[i].calcularSueldo();
                                    conf = true;
                                }
                            }
                        }
                        if(!conf){
                            JOptionPane.showMessageDialog(null, "No queda espacio en el arreglo!");
                        }
                        break;
                    case 3:
                        conf = false;
                        for(int i = 0 ; i<arrEmpleado.length ; i++){
                            if(arrEmpleado[i] == null){
                                if(!conf){
                                    numero = Integer.parseInt(JOptionPane.showInputDialog("Numero de empleado"));
                                    nombre = JOptionPane.showInputDialog("Nombre de empleado");
                                    antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Antiguedad de empleado"));
                                    pagoPorHora = Double.parseDouble(JOptionPane.showInputDialog("Pago por hora"));
                                    horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Horas trabajadas"));
                                    arrEmpleado[i] = new EmpleadoManual(numero, nombre, antiguedad, pagoPorHora, horasTrabajadas);
                                    arrEmpleado[i].calcularSueldo();
                                    conf = true;
                                }
                            }
                        }
                        if(!conf){
                            JOptionPane.showMessageDialog(null, "No queda espacio en el arreglo!");
                        }
                        break;
                    case 4:
                        mostrarEmpleados(arrEmpleado);
                        break;
                    case 5:
                        conf = false;
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero de empleado a borrar"));
                        for(int i = 0 ; i < arrEmpleado.length ; i++){
                            if(arrEmpleado[i] != null){
                                if(!conf){
                                    if(arrEmpleado[i].getNumero() == numero){
                                        arrEmpleado[i] = null;
                                        conf = true;
                                    }
                                }
                            }
                        }
                        if(!conf){
                            JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                        }
                        break;
                }
            }
        }
    }
    public static void mostrarEmpleados(Empleado[] arrEmpleado){
        for(int i = 0 ; i < arrEmpleado.length ; i++){
            if(arrEmpleado[i] != null){
                JOptionPane.showMessageDialog(null, arrEmpleado[i].mostrarEmpleado());
            }
        }
    }
}
