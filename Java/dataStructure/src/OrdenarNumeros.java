import java.util.Arrays;

public class OrdenarNumeros {
    
    public static void main(String[] args) {
        int[] arr = {21, 1, 26, 45, 29, 28, 2, 9, 16, 49, 39, 27, 43, 34, 46, 40};
        mergeSort(arr, 0, arr.length-1, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int l, int r, int count) {
        if (l < r && count > 0) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m, count-1); // llamada recursiva a mergeSort con la mitad izquierda
            mergeSort(arr, m + 1, r, count-1); // llamada recursiva a mergeSort con la mitad derecha
            merge(arr, l, m, r); // combinamos las mitades ordenadas
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}