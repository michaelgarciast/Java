//Librerias
import javax.swing.*;
import java.util.*;

public class BusquedaEstudiantes {
    public static void main(String[] args) {
        //Arreglo lista de estudiantes
        String nombres[] = {"Marlon Ubeimar", "Jose Manuel", "Daniel Alexander", "Jeisson Fabian", "Martin Alejandro", "Deiby Andres", "Luis Jonnathan", "David Santiago", "Martin", 
        "Michael Steven", "Yeraldin", "Mateo", "Juan Sebastian Camilo", "Jose Sebastian", "Cristian Mateo", "Kevin Steven", "Karen Juliana", "Jhoan David", "Albeiro De Jesus", "Marlon David"};
        String nombreBuscado;
        boolean encontrado = false;
        int posicion = -1;

        // Ordenamos el arreglo de nombres alfabéticamente
        Arrays.sort(nombres);

        // Solicitamos el nombre a buscar
        nombreBuscado = JOptionPane.showInputDialog("Digite el nombre a buscar: ");

        // Realizamos la búsqueda binaria
        int inicio = 0;
        int fin = nombres.length - 1;
        int medio;
        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            int comparacion = nombres[medio].compareTo(nombreBuscado);
            if (comparacion == 0) {
                encontrado = true;
                posicion = medio;
                break;
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        // Mostramos el resultado de la búsqueda
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "El estudiante " + nombreBuscado +  " fue encontrado " + "en la posición " + posicion + " del arreglo.");
        } else {
            JOptionPane.showMessageDialog(null, "El estudiante " + nombreBuscado + " no se encuentra en la lista.");
        }
    }
    
}