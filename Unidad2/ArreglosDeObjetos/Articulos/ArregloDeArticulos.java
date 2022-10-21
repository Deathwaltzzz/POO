package Unidad2.ArreglosDeObjetos.Articulos;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Write a description of class ArregloDeArticulos here.
 *
 * @author (Jorge Alberto Babun Muñoz)
 * @version (10 de Marzo 2022)
 */
public class ArregloDeArticulos
{
    public static void main(String [] args){
        String clave, descripcion;
        double precio;
        boolean encontro,alta;
        
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
                int baja;
                baja = Integer.parseInt(JOptionPane.showInputDialog("Posicion a borrar"));
                baja--;
                if(baja < 0 || baja >= numArticulos){
                    JOptionPane.showMessageDialog(null, "Posicion fuera de rango");
                }else{
                    if(arreglo[baja]==null){
                        JOptionPane.showMessageDialog(null, "Posicion vacia (sin articulo)");
                    }else{
                        JOptionPane.showMessageDialog(null, arreglo[baja].toString());
                        arreglo[baja]= null;
                    }
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
