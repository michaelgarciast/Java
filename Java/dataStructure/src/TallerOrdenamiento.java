

//Librerias
import java.util.Scanner;

public class TallerOrdenamiento {
    private Scanner teclado;
    private int [] numero;

    public void cargar() {
        teclado = new Scanner(System.in);
        numero = new int [5];
        for(int i = 0; i < numero.length; i++){
            System.out.println("Ingrese el numero: ");
            numero[i] = teclado.nextInt();
        }
    }

    public void ordenar() {
        for(int k = 0; k < 4; k++){
            for(int j = 0; j < 4; j++){
                if(numero[j] > numero[j+1]){
                    int aux;
                    aux = numero[j];
                    numero[j] = numero [j+1];
                    numero[j+1] = aux;
                }
            }
        }
    }

    public void impimir() {
        System.out.println("Este es el vector ordenado de menor a mayor: ");
        for(int j = 0; j < numero.length; j++){
            System.out.println(numero[j]);
        }
    }
    public static void main(String args[]) {
        TallerOrdenamiento vector = new TallerOrdenamiento();
        vector.cargar();
        vector.ordenar();
        vector.impimir();
    }
}



