package Unidad2.Estudiante;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 * Write a description of class PromedioEstudiante here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (a version number or a date)
 */
public class PromedioEstudiante
{
    public static void main(String[] args){
        Estudiante estudiante;
        DecimalFormat df = new DecimalFormat("#.##");
        String nombre;
        int matricula = 1;
        double calificacion1,calificacion2,calificacion3;
        while(matricula != 0){
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la matricula o cero para termniar"));
            if(matricula > 0){
                nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                estudiante = new Estudiante(nombre,matricula);
                calificacion1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primer calificacion"));
                calificacion2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda calificacion"));
                calificacion3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera calificacion"));
                double promedio = estudiante.calculaPromedio(calificacion1,calificacion2,calificacion3);
                JOptionPane.showMessageDialog(null, "Nombre del alumno: " + nombre + "Matricula: " +matricula +"Promedio de las 3 calificaciones: " + df.format(promedio));
                JOptionPane.showMessageDialog(null, estudiante.toString());
            }
        }
    }
}
