package Unidad3.Herencia.Vehiculo;
import javax.swing.JOptionPane;

/**
 * Crear un arreglo de vehiculos donde se pueda poner objetos de Vehiculo, automovil, camionetas y camion.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (03/29/22)
 */
public class CreaVehiculos
{
    public static void muestraArreglo(Vehiculo[] arrVehiculos){
        for(int i = 0 ; i < arrVehiculos.length ; i++){
            if(arrVehiculos[i] != null){
                JOptionPane.showMessageDialog(null, arrVehiculos[i].toString());
            }
        }
    }

    public static void main(String[] args){
        String modelo, marca;
        int año, numPasajeros, numPuertas;
        double capacidadCarga;
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo"));
        int cont=0;
        Vehiculo[] arrVehiculos = new Vehiculo[tam];

        String menu = "1)Vehiculo \n2) Automovil \n3) Camioneta \n4) Camion \n5) Mostrar vehiculos \n6) Terminar";

        int opc = 0;
        while (opc != 6){
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(opc !=6){
                if(opc == 5){
                    muestraArreglo(arrVehiculos);
                }else if(opc !=5){
                    if(cont < tam){
                        modelo = JOptionPane.showInputDialog("Modelo del vehiculo");
                        marca = JOptionPane.showInputDialog("Marca del vehiculo");
                        año = Integer.parseInt(JOptionPane.showInputDialog("Año del vehiculo"));
                        switch (opc){
                            case 1:
                                arrVehiculos[cont] = new Vehiculo(modelo,marca,año);
                                cont++;
                                break;
                            case 2:
                                numPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Numero de pasajeros"));
                                arrVehiculos[cont] = new Automovil (modelo,marca,año,numPasajeros);
                                cont++;
                                break;
                            case 3:
                                numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Numero de puertas"));
                                arrVehiculos[cont] = new Camioneta(modelo,marca,año,numPuertas);
                                cont++;
                                break;
                            case 4:
                                capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Capacidad de carga"));
                                arrVehiculos[cont] = new Camion(modelo,marca,año,capacidadCarga);
                                cont++;                            
                                break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "No queda espacio en el arreglo");
                    }
                }  
            }
        }
    }
}
