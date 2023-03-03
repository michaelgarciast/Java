// Taller #4
//Realizar un programa en java que permita cargar los nombres de 5 alumnos y sus notas respectivas. 
//Luego ordenar las notas de mayor a menor. Imprimir las notas y los nombres de los alumnos.

//Librerias
import java.util.*;

public class ListAlumnosNotas {
    // Declaracion de variables
    private Scanner teclado;
    private String [] nombres;
    private float [] notas;
    private int cantNombresAlumnos = 5;
    private int cantNotas = 5;

    public void cargarNotasynombres() {
        teclado = new Scanner(System.in);
        nombres = new String[cantNombresAlumnos];
        notas = new float[cantNotas];
        System.out.println("Ingrese el nombre del alumno y su nota");
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Digite el nombre del alumno " + (i+1) + ": ");
            nombres[i] = teclado.next();
            System.out.println("Digite la nota del alumno " + (i+1) + ": ");
            notas[i] = teclado.nextFloat();
        }
    }

    public void ordenarNotas() {
        for(int k = 0; k < notas.length; k++){
            for(int j = 0; j < notas.length -1; j++){
                if(notas[j] > notas[j+1]){
                    Float auxNotas = notas[j];
                    notas[j] = notas[j+1];
                    notas[j+1] = auxNotas;

                    String auxNombres = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = auxNombres;
                }

            }
        }
    }

    public void imprimirNotas() {
        System.out.println("Vector de notas ordenado de menor a mayor: ");
        for(int i = 0; i < notas.length; i++){
            System.out.println( "La nota " + notas[i] + " Corresponde al alumno: " + nombres[i]);
        }
    }

    public static void main(String args[]) {
        ListAlumnosNotas vector = new ListAlumnosNotas();
        vector.cargarNotasynombres();
        vector.ordenarNotas();
        vector.imprimirNotas();
    }
}
