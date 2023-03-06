//Taller #3 
//Ejercicio #2
//Realice un programa en java donde se crea un vector donde almacenar los nombres de 5 países. 
//Ordenar el vector países de forma alfabético.

//Librerias
import java.util.*;

public class VectorPaises {
    //Declaracion de variables
    private Scanner teclado;
    private int cantListPaises = 5;
    private String [] paises;

    public void nombresPaises() {
        teclado = new Scanner(System.in);
        paises = new String [cantListPaises];
        // Solicitar al usuario que ingrese nombres de países
        for (int i = 0; i < paises.length; i++) {
            System.out.print("Ingrese el nombre del país # " + (i+1) + ": ");
            paises[i] = teclado.nextLine();
        }
    }

    public void ordenar() {
        //Ordenar paises
        Arrays.sort(paises);
    }
    public void imprimir() {
        //Imprimir vector de paises
        System.out.println("Vector de paises ordenados alfabeticamente: ");
        for(int j = 0; j < paises.length; j++){
            System.out.println(paises[j]);
        }
    }

    public static void main(String args[]) {
        VectorPaises vector = new VectorPaises();
        //Inicializar funciones
        vector.nombresPaises();
        vector.ordenar();
        vector.imprimir();
    }
}
