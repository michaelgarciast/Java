//Librerias
import java.util.*;

public class Ordenamiento {
    private static Scanner teclado;
    public static void main(String args[]) {
        teclado = new Scanner(System.in);
        int arreglo[] = new int [20];
        int numero, i,j,incremento,aux;
        System.out.print("Ingrese el tamaño del arreglo: ");
        numero = teclado.nextInt();
        for(i = 1; i<= numero; i++){
            System.out.println("A[" + i + "] = ");
            arreglo[i] = teclado.nextInt();
        } 
        incremento = numero /2;
        while(incremento > 0){
            for(i = incremento + 1; i<= numero; i++){
                j = i - incremento;
                while(j > 0){
                    if(arreglo[j] >= arreglo[j+ incremento]){
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + incremento];
                        arreglo[j+incremento] = aux;
                    }else{
                        j = 0;
                    }
                }
                j = j - incremento;
            }
            incremento = incremento /2;
        }
        System.out.println("El arreglo esta ordenado");
            for(i = 1; i <= numero; i++){
                System.out.println(" " + arreglo[i]);
        }
    }
}