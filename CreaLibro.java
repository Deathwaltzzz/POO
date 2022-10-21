import javax.swing.JOptionPane;
 
/**
 * Write a description of class CreaLibro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreaLibro
{
    public static void main(String[] args){
        Libro unLibro;
        int volumen=1;
        String autor;
        String editorial;
        String titulo;
        String editorialAChecar;
        while(volumen > 0){
            volumen = Integer.parseInt(JOptionPane.showInputDialog(null, "Teclee el volumen del libro"));
            unLibro = new Libro(volumen);
            titulo = JOptionPane.showInputDialog(null, "Ingrese el nombre del titulo");
            autor = JOptionPane.showInputDialog(null, "Ingrese el nombre del autor");
            editorial = JOptionPane.showInputDialog(null, "Ingrese el nombre del editorial");
            unLibro.setTitulo(titulo);
            unLibro.setAutor(autor);
            unLibro.setEditorial(editorial);
            editorialAChecar = JOptionPane.showInputDialog(null, "Ingrese el nombre del editorial a buscar");
            boolean conf = unLibro.buscaEditorial(editorialAChecar);
            if(conf == true){
                JOptionPane.showMessageDialog(null,"Se ha encontrado la editorial");
            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado la editorial introducida");
            }
            
            JOptionPane.showMessageDialog(null, unLibro.toString());
        }
    }

}
