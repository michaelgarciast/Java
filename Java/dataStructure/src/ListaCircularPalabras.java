//Libreria
import java.util.*;

public class ListaCircularPalabras {
    private static class Nodo {
        String palabra;
        Nodo siguiente;
        // Constructor de la clase Nodo
        Nodo(String palabra) {
            this.palabra = palabra;
            this.siguiente = null;
        }
    }
    // Declarar variables
    private static Nodo primero;
    private static Scanner teclado;
    
    // Método principal
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int opcion = 0;

        // Ciclo principal del programa
        do {
            System.out.println("//-------Seleccione una opción-------//:");
            System.out.println("1. Agregar palabra");
            System.out.println("2. Mostrar palabras");
            System.out.println("3. Borrar palabra");
            System.out.println("4. Salir");
            System.out.print("La opcion es: ");
            opcion = teclado.nextInt();

            // Realizar una acción basada en la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la palabra:");
                    String palabra = teclado.next();
                    agregarPalabra(palabra);
                    break;
                case 2:
                    mostrarPalabras();
                    break;
                case 3:
                    System.out.println("Ingrese la palabra a borrar:");
                    String palabraBorrar = teclado.next();
                    borrarPalabra(palabraBorrar);
                    break;
                case 4:
                    eliminarLista();
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }
    // Método para agregar una palabra a la lista
    private static void agregarPalabra(String palabra) {
        Nodo nuevoNodo = new Nodo(palabra);

        if (primero == null) {
            primero = nuevoNodo;
            nuevoNodo.siguiente = primero;
        } else {
            Nodo ultimo = primero;
            while (ultimo.siguiente != primero) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = primero;
        }
        System.out.println("Palabra agregada exitosamente");
    }
    // Método para mostrar las palabras en la lista
    private static void mostrarPalabras() {
        if (primero == null) {
            System.out.println("La lista está vacía");
        } else {
            Nodo actual = primero;
            do {
                System.out.println(actual.palabra);
                actual = actual.siguiente;
            } while (actual != primero);
        }
    }
    // Método para borrar una palabra de la lista
    private static void borrarPalabra(String palabra) {
        if (primero == null) {
            System.out.println("La lista está vacía");
        } else if (primero.palabra.equals(palabra)) {
            if (primero.siguiente == primero) {
                primero = null;
            } else {
                Nodo ultimo = primero;
                while (ultimo.siguiente != primero) {
                    ultimo = ultimo.siguiente;
                }
                primero = primero.siguiente;
                ultimo.siguiente = primero;
            }
            System.out.println("Palabra borrada");
        } else {
            Nodo anterior = primero;
            Nodo actual = primero.siguiente;
            while (actual != primero) {
                if (actual.palabra.equals(palabra)) {
                    anterior.siguiente = actual.siguiente;
                    System.out.println("Palabra borrada");
                    return;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            System.out.println("La palabra no se encontró en la lista");
        }
    }   

    // Método para eliminar toda la lista
    private static void eliminarLista() {
        primero = null;
        System.out.println("Lista eliminada");
    }
}
