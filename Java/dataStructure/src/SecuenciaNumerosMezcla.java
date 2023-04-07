//Librerias
import java.util.*;

public class SecuenciaNumerosMezcla {
    //inicializa un arreglo de enteros llamado vector
    public static void main(String args[]){
        int vector [] = {21, 1, 26, 45, 29, 28, 2, 9, 16, 49, 39, 27, 43, 34, 46, 40};
        System.out.println("Vector original: ");
        imprimirVector(vector);
        System.out.println("El vector ordenado: ");
        OrdenacionMergeSort(vector);
        imprimirVector(vector);
    }
    //ordenar el vector e imprime en consola el vector ya ordenado.
    public static void OrdenacionMergeSort(int vector[]) {
        if(vector.length <= 1)
        return;
        {
            int mitad = vector.length/2;
            int izq[] = Arrays.copyOfRange(vector, 0, mitad);
            int der[] = Arrays.copyOfRange(vector, mitad, vector.length);
            OrdenacionMergeSort(izq);
            OrdenacionMergeSort(der);
            CombinarVector(vector, izq, der);
        }
    }
    //Combinar dos subvectores ordenados en un único vector ordenado
    public static void CombinarVector(int v[], int izq[], int der[]) {
            int i = 0;
            int j = 0;
            for(int  k = 0; k < v.length; k++){
                if(i>= izq.length){
                    v[k] = der[j];
                    j++;
                    continue;
                }
                if(j >= der.length){
                    v[k] = izq[i];
                    i++;
                    continue;
                }
                if(izq[i] < der [j]){
                    v[k] = izq[i];
                    i++;
                }else{
                    v[k] = der[j];
                    j++;
                }
            }
        }
    //Imprimir un vector en consola
    public static void imprimirVector(int vector[]) {
        System.out.println(Arrays.toString(vector));
    }
}
