package Unidad2.ArreglosDeObjetos.Articulos;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Write a description of class ArregloDeArticulos1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArregloDeArticulos1
{
    public static void main(String [] args){
        String clave, descripcion;
        double precio;
        boolean encontro,alta,baja;
        
        Scanner leer = new Scanner(System.in);
        
        int numArticulos = (Integer.parseInt(JOptionPane.showInputDialog("Numero de articulos: ")));
        
        //declarar arreglo
        Articulo[] arreglo;
        
        //crear arreglo
        arreglo = new Articulo[numArticulos];
        
        String menu = "\n 1 Insertar " + "\n 2 Borrar " + "\n 3 Buscar " + "\n 4 Mostar" + "\n 5 Terminar";
        int pos=0;
        int opc=1;
        while(opc!=5){
            opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
            //insertar un articulo
            if (opc == 1){
                alta = false;
                int indice = 0;
                while(alta == false && indice < numArticulos){
                    if(arreglo[indice] == null){
                        clave = JOptionPane.showInputDialog("Clave Articulo");
                        descripcion = JOptionPane.showInputDialog("Descripcion");
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del articulo"));
                        arreglo[indice]=new Articulo (clave,descripcion,precio);
                        alta = true;
                    }
                    indice++;
                }
                if(alta==false){
                    JOptionPane.showMessageDialog(null, "Arreglo lleno");
                }
            }
            //borrar un articulo por su posicion
            if (opc == 2){
                baja = false;
                int indice = 0;
                clave = JOptionPane.showInputDialog(null, "Articulo a borrar");
                
                while(baja == false && indice < arreglo.length){
                    if (arreglo[indice].getClave().equals(clave)){
                        arreglo[indice] = null;
                        baja = true;
                    }
                    indice++;
                }
                
            }
            //buscar un articulo por todos sus datos
            if (opc == 3){
                encontro = false;
                clave = JOptionPane.showInputDialog("Clave del articulo");
                descripcion = JOptionPane.showInputDialog("Descripcion del articulo");
                precio = Double.parseDouble(JOptionPane.showInputDialog("Precio"));
                Articulo objeto = new Articulo(clave, descripcion, precio);
                for(int i = 0 ; i<arreglo.length ; i++){
                    if(arreglo[i] != null){
                        if(arreglo[i].equals(objeto)){
                            JOptionPane.showMessageDialog(null, "Articulo encontrado");
                            encontro = true;
                        }
                    }
                }
            }
            //mostrar articulos
            if (opc == 4){
                for(int i = 0 ; i< arreglo.length ; i++){
                    if( arreglo[i] != null){
                        JOptionPane.showMessageDialog(null, arreglo[i].toString());
                    }
                }
            }
        }
    }
}
