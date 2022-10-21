package Unidad2.ArreglosDeObjetos.Persona;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Write a description of class ArregloPersonas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArregloPersonas
{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.##");
        
        String nombre;
        int edad,numPer;
        double peso, altura;
        
        Persona [] arrPer;
        numPer = Integer.parseInt(JOptionPane.showInputDialog("Numero de personas"));
        arrPer = new Persona[numPer];
        
        for(int j = 0 ; j<arrPer.length; j++){
            nombre = JOptionPane.showInputDialog("Nombre");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
            arrPer[j] = new Persona();
            arrPer[j].setNombre(nombre);
            arrPer[j].setEdad(edad);
            arrPer[j].setPEso(peso);
            arrPer[j].setAltura(altura);
        }
        //mostrar el arreglo de personas
        for(int j = 0 ; j<arrPer.length ; j++){
            JOptionPane.showInputDialog(null,"IMC " + df.format(arrPer[j].calcularImc()) + arrPer[j].toString());
        }
        //pedir el nombre de una persona, buscarlo y si lo encuentra modificar el peso
        boolean encontro = false;
        nombre = JOptionPane.showInputDialog("Nombre");
        for(int j = 0 ; j<arrPer.length && encontro == false ; j++){
            if(nombre.equals(arrPer[j].getNombre())){
                encontro = true;
                peso = Double.parseDouble(JOptionPane.showInputDialog("Nuevo peso"));
                arrPer[j].setPEso(peso);
                JOptionPane.showMessageDialog(null,arrPer[j].toString());
            }
        }
        if(encontro == false){
            JOptionPane.showMessageDialog(null, "Nombre " + nombre + " no encontrado");
        }
        //mostrar la persona con el IMC mas alto
        double imc = arrPer[0].calcularImc();
        int i = 0;
        for(int j = 0 ; j<arrPer.length ; j++){
            if(arrPer[j].calcularImc() > imc){
                imc = arrPer[j].calcularImc();
                i = j;
            }
        }
        JOptionPane.showMessageDialog(null,"imc mas alto " + arrPer[i].toString());
        //pedir el nombre de una persona y daro de baja
        encontro = false;
        nombre = JOptionPane.showInputDialog("Nombre a dar de baja");
        for(int j = 0 ; j < arrPer.length && encontro == false ; j++){
            if(nombre.equals(arrPer[j].getNombre())){
                encontro = true;
                JOptionPane.showMessageDialog(null, arrPer[j].toString());
                arrPer[j] = null;
            }
        }
        if(encontro == false){
            JOptionPane.showMessageDialog(null,"Nombre " + nombre + " no encontrado");
        }
        JOptionPane.showMessageDialog(null, arrPer.length);
    }
}
