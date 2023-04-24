import java.util.*;

public class MatrizTeclado {
    
    private Scanner teclado;
    private int [][] matriz;
    private int fila; 
    private int columna;

    public void cargarMatriz() {
        teclado = new Scanner(System.in);
        System.out.println("Cuantas filas tiene la matriz");
        fila = teclado.nextInt();
        System.out.println("Cuantas columnas tiene la matriz");
        columna = teclado.nextInt();
        matriz = new int[fila][columna];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese los elementos de la matriz");
                matriz [i] [j] = teclado.nextInt();
            }
        }
    }
    public void imprimirMatriz() {
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz [i] [j] + " ");
            }
            System.out.println(" ");
        }
    }
    public void ultimaFila() {
        System.out.println("Esta es la ultima fila");
        for(int j = 0; j < matriz[matriz.length-1].length; j++){
            System.out.println(matriz[matriz.length-1][j] + " ");
        }
    }
    public static void main(String[]args) {
        MatrizTeclado vector = new MatrizTeclado();
        vector.cargarMatriz();
        vector.imprimirMatriz();
        vector.ultimaFila();
    }
}
