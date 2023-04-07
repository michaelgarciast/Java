//Librerias
import java.util.*;

public class MezclaAlumnos {
    //Inicializar Variables
    private static Scanner teclado;
    public static void main(String args[]) {
        teclado = new Scanner(System.in);
        //Ingresar cantidad de alumnos
        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = teclado.nextInt();
        String[] nombres = new String[n];
        // Iteracion de nombre de alumnos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del alumno #" + (i+1) + ": ");
            nombres[i] = teclado.next();
        }
        //Lista original de alumnos
        System.out.println("Lista de alumnos original: ");
        imprimirNombres(nombres);
        //Lista de alumnos ordenada
        System.out.println("Lista de alumnos ordenada: ");
        ordenacionMergeSort(nombres);
        imprimirNombres(nombres);
    }
    //Función para ordenar el vector
    public static void ordenacionMergeSort(String[] nombres) {
        if(nombres.length <= 1) {
            return;
        }
        int mitad = nombres.length / 2;
        String[] izq = Arrays.copyOfRange(nombres, 0, mitad);
        String[] der = Arrays.copyOfRange(nombres, mitad, nombres.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);
        combinarNombres(nombres, izq, der);
    }
    //Función para combinar el vector de nombres
    public static void combinarNombres(String[] nombres, String[] izq, String[] der) {
        int i = 0, j = 0, k = 0;
        while (i < izq.length && j < der.length) {
            String[] nombreIzq = izq[i].split(" ");
            String[] nombreDer = der[j].split(" ");
            if (nombreIzq[0].compareTo(nombreDer[0]) < 0) {
                nombres[k] = izq[i];
                i++;
            } else {
                nombres[k] = der[j];
                j++;
            }
            k++;
        }
        while (i < izq.length) {
            nombres[k] = izq[i];
            i++;
            k++;
        }
        while (j < der.length) {
            nombres[k] = der[j];
            j++;
            k++;
        }
    }
    // Funcion para imprimir Nombres
    public static void imprimirNombres(String[] nombres) {
        System.out.println(Arrays.toString(nombres));
    }
}