package Unidad3.Herencia.TiendaTelas;
import javax.swing.JOptionPane;

/**
 * La clase venta telas creara objetos de mezcilla, algodon y tendra un metodo de consultar y terminar
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VentaTelas
{
    public static void muestraArreglo(Telas[] telas){
        for(int i = 0 ; i < telas.length ; i++){
            if(telas[i]!= null){
                JOptionPane.showMessageDialog(null, telas[i].toString());
            }
        }
    }

    public static void main(String[] args){
        String color,tipo;
        int cantidad;
        double precio;
        double importe;
        int cantVentas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de ventas"));
        int cont = 0,opc = 0;
        //int contVentasMezclilla=0, contVentasAlgodon=0;
        String menu = "Venta telas \n1)Mezcilla \n2)Algondon \n3)Consultar \n4) Terminar ";

        Telas[] telas = new Telas[cantVentas];
        while (opc !=4){
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(opc !=4){
                if(opc == 3){
                    muestraArreglo(telas);
                }else if(opc !=3 && opc<4){
                    //if(opc == 1){

                    //  JOptionPane.showMessageDialog(null, "Ventas de mezclilla: " + contVentasMezclilla +
                    //    "\nVentas de algodon: " + contVentasAlgodon +
                    //  "\nTotal ventas: " + (contVentasMezclilla + contVentasAlgodon));

                    {
                        if(cont < cantVentas){
                            color = JOptionPane.showInputDialog("Color de tela");
                            tipo = JOptionPane.showInputDialog("Tipo de tela");
                            switch (opc){
                                case 1:
                                    telas[cont] = new Mezclilla(color, tipo);
                                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de telas"));
                                    telas[cont].setCantidad(cantidad);
                                    precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de las telas"));
                                    telas[cont].setPrecio(precio);
                                    ((Mezclilla)telas[cont]).calculaImporte();
                                    //contVentasMezclilla += cantidad;
                                    cont++;
                                    break;
                                case 2:
                                    telas[cont] = new Algodon(color, tipo);
                                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de telas"));
                                    telas[cont].setCantidad(cantidad);
                                    precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de la tela"));
                                    telas[cont].setPrecio(precio);
                                    ((Algodon)telas[cont]).calculaImporte();
                                    //contVentasAlgodon += cantidad;
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
}
