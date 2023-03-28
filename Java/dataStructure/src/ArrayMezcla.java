//Librerias
import java.util.*;

public class ArrayMezcla{
    public static void main(String args[]){
        int vector [] = {5,6,4,2,3,1,7,8,9};
        System.out.println("Vector original");
        imprimirVector(vector);
        System.out.println("El vector ordenado");
        OrdenacionMergeSort(vector);
        imprimirVector(vector);
    }
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
        public static void imprimirVector(int vector[]) {
            for(int i = 0; i<vector.length; i++){
                System.out.println(vector[i] + "");
            }
        }
    }