//Librerias
import java.util.Arrays;

public class OrdenamientoPuntoDos {
    public static void main(String args[]) {
        //Vector desordenado
        int [] arr = {5, 16, 20, 12, 3, 8, 9, 17, 19, 7};
        int n = arr.length;
        // Definimos los incrementos para el método Shell
        int incremento = n/2;

        while(incremento > 0){
            // Recorremos el array de izquierda a derecha
            for(int i = incremento; i < n; i++){
                int temp = arr[i];
                int j;
                //elementos hacia la derecha
                for(j = i; j >= incremento && arr[j-incremento] > temp; j -=incremento){
                    arr[j] = arr[j-incremento];
                }
                //elemento en su posición correcta
                arr[j] = temp;
            }
            // Reducir el incremento
            incremento /= 2;
        }
        // Vector ordenado            
        System.out.println("Vector ordenado: " + Arrays.toString(arr));
    }
}