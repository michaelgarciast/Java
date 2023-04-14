// //Librerias
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);
//         int fs = teclado.nextInt();
//         int n = teclado.nextInt();
//         int arreglo[] = new int [n];
//         for(int i = 0; i < n; i++){
//             arreglo[i] = teclado.nextInt();
//         }
//         int index = BusquedaSecuencial(arreglo, fs, n);
//         if(index == -1){
//             System.out.println("No encontrado");
//         }else{
//             System.out.println(fs + "El indice encontrado es: " + index);
//         }
//     }
//     static int BusquedaSecuencial(int arreglo[], int m, int n ){
//         int index = -1;
//         for(int i = 0; i < n; i++){
//             if(arreglo[i] == m){
//                 index = i;
//                 break;
//             }else{
//                 index = -1;
//             }
//         }
//         return index;
//     }
// }
