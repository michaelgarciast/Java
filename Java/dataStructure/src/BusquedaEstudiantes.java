//Librerias
import java.util.*;
public class BusquedaEstudiantes {

    //Inicializacion de varibles
    private Scanner teclado;
    private String estudianteBuscado;
    private int indice;

    // Arreglo de estudiantes
    String[] estudiantes = {"Albeiro De Jesus", "Cristian Mateo", "Daniel Alexander", "David Santiago", "Deiby Andres", 
    "Jeisson Fabian", "Jhoan David", "Jose Manuel", "Jose Sebastian", "Juan Sebastian Camilo", 
    "Karen Juliana", "Kevin Steven", "Luis Jonnathan", "Marlon", "Marlon David", 
    "Martin", "Martin Alejandro", "Mateo", "Michael Steven", "Yeraldin"};

    public void ordenarArray() {
        // Ordenar el arreglo de estudiantes en orden alfabético
        Arrays.sort(estudiantes);
        
        // Scanner para leer la entrada del usuario
        teclado = new Scanner(System.in);
        
        // Pedimos al usuario el nombre del estudiante a buscar
        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        estudianteBuscado = teclado.nextLine();
    }
    public void busquedaDeEsudiante() {
        // Búsqueda binaria
        indice = Arrays.binarySearch(estudiantes, estudianteBuscado);
        
        if (indice >= 0) {
            // Si encontramos al estudiante, mostramos al siguiente estudiante
            int siguienteIndice = indice + 1;
            if (siguienteIndice < estudiantes.length) {
                System.out.println("El siguiente estudiante es: " + estudiantes[siguienteIndice]);
            } else {
                System.out.println("No hay más estudiantes después de " + estudianteBuscado);
            }
        } else {
            // Si no encontramos al estudiante, mostramos un mensaje de error
            System.out.println("No se encontró al estudiante " + estudianteBuscado);
        }
    }

    //Inicialización de funciones
    public static void main(String[] args) {
        BusquedaEstudiantes vector = new BusquedaEstudiantes();
        vector.ordenarArray();
        vector.busquedaDeEsudiante();
        
    }
}