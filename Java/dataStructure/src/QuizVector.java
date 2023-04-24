//Librerias
import java.util.*;
public class QuizVector {

    private Scanner teclado;
    private int cantNumeros = 10;
    private int [] numeros;
    private int suma = 0;
    private double promedio;

    public void mostrarVector() {
        teclado = new Scanner(System.in);
        numeros = new int [cantNumeros];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero # " + (i+1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
    }
    public void imprimirVector() {
        promedio = (double) suma / numeros.length;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio de los numeros es: " + promedio);
        System.out.println("El numero mayor es: ");
    }
    
    public static void main(String args[]) {
        QuizVector vector = new QuizVector();
        vector.mostrarVector();
        vector.imprimirVector();
    }
}
