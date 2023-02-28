//Librerias
import java.util.*;

public class TallerOrdenamientoLetras {
    private Scanner teclado;
    private String [] nombre;
    private int cantLetras = 8;

    public void cargar() {
        teclado = new Scanner(System.in);
        nombre = new String [cantLetras];
        for(int i = 0; i < nombre.length; i++){
            System.out.println("Ingrese el numero: " + (i+1));
            nombre[i] = teclado.next();
        }
    }

    public void ordenar() {
        for(int k = 0; k < 7; k++){
            for(int j = 0; j < 7; j++){
                if(nombre[j].compareTo(nombre[j+1])>0){
                    String aux;
                    aux = nombre[j];
                    nombre[j] = nombre [j+1];
                    nombre[j+1] = aux;
                }
            }
        }
    }

    public void impimir() {
        System.out.println("Este es el vector ordenado de menor a mayor: ");
        for(int j = 0; j < nombre.length; j++){
            System.out.println(nombre[j]);
        }
    }
    public static void main(String args[]) {
        TallerOrdenamientoLetras vector = new TallerOrdenamientoLetras();
        vector.cargar();
        vector.ordenar();
        vector.impimir();
    }
}



