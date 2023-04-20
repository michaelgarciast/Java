//Librerias
import javax.swing.*;

public class BusquedaSecuencialApellido {
    public void busquedaDeApellido() {
        //Arreglo de apellido de estudiantes
        String[] nombres = {"Juan", "Michael", "Pedro", "Lucia", "Carlos"};
        String[] apellidos = {"Pérez", "González", "García", "González", "García"};
        String apellidoBusqueda;
        //Input para preguntar por pantalla el apellido a buscar
        apellidoBusqueda = JOptionPane.showInputDialog("Digite el apellido de búsqueda:");
        //Bucle for para encontrar el apellido a buscar
        boolean encontrado = false;
        for (int i = 0; i < apellidos.length; i++) {
            if (apellidos[i].equalsIgnoreCase(apellidoBusqueda)) {
                System.out.println(nombres[i] + " " + apellidos[i]);
                encontrado = true;
            }
        }
        // Estudiante o apeelido no encontrado en el arreglo
        if (!encontrado) {
            System.out.println("NINGUNO");
        }
    }
    //Inicializacion de función
    public static void main(String[] args) {
        BusquedaSecuencialApellido vector = new BusquedaSecuencialApellido();
        vector.busquedaDeApellido();   
    }
}