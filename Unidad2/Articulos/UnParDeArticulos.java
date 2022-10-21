package Unidad2.Articulos;
import java.util.Scanner;


/**
 * Write a description of class UnParDeArticulos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnParDeArticulos
{
    public static void main(String[] args){
        String descripcion;
        double precio;
        int clave;
        
        Scanner sc = new Scanner(System.in);
        
        /**
             * 1) Pedi datos y crear un objeto 
         */
        System.out.println("Datos del objeto 1");
        System.out.println("Clave ");
        clave = sc.nextInt();
        System.out.println("Descripcion ");
        descripcion = sc.next();
        System.out.println("Precio ");
        precio = sc.nextDouble();
        
        Articulo objeto1 = new Articulo(clave, descripcion, precio);
        
        /**
             * 2) Pedir objetos de el objeto 2 
         */
        System.out.println("Datos del objeto 2");
        System.out.println("Clave ");
        clave = sc.nextInt();
        System.out.println("Descripcion ");
        descripcion = sc.next();
        System.out.println("Precio ");
        precio = sc.nextDouble();
        
        Articulo objeto2 = new Articulo(clave, descripcion, precio);
        
        /**
             * 3)mostrar el total a pagar
         */
        double suma = objeto1.getPrecio() + objeto2.getPrecio();
        System.out.println("\nSuma de los dos articulos " + suma);
        
        /**
              *4) Mostrar oclave y descripcion del objeto
              *con precio mas alto
         */
        System.out.println("\nArticulo con precio mas alto");
        if(objeto1.getPrecio() > objeto2.getPrecio()){
            System.out.println("Articulo 1 " + "Clave " + objeto1.getClave() + " Descripcion " + objeto1.getDescripcion());
        }else{
            System.out.println("Articulo 2 " + "Clave " + objeto2.getClave() + " Descripcion " + objeto2.getDescripcion());
        }
        
        /**
             * 5) mostrar los datos de ambos objetos
         */
        System.out.println("\nMostrar ambos articulos con toString()");
        System.out.println(objeto1.toString());
        System.out.println(objeto2.toString());
        
        /**
              * 6) Comparar ambos objetos 
         */
        System.out.println("\nComparar ambos Articulos");
        if(objeto1.equals(objeto2)){
            System.out.println("Los objetos son iguales");
        }else{
            System.out.println("Los objetos son diferentes");
        }
        
        /**
             * 7) Modificar precio del articulo uno
         */
        System.out.println("\nPrecio nuevo de articulo uno");
        precio = sc.nextDouble();
        objeto1.setPrecio(precio);
        System.out.println("\n" + objeto1.toString());
    }
}
