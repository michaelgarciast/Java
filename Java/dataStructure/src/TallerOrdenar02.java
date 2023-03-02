//Librerias
import java.util.*;

public class TallerOrdenar02{

    private Scanner teclado;
    private String [] nombre;
    private int [] numero;

    public void cargar() {
        teclado = new Scanner(System.in);
        nombre =  new String[5];
        numero  = new int [5];
        System.out.println("Ingresar el nombre y numero: ");
        for(int i = 0; i < nombre.length; i++ ){
            System.out.println("Digite el nombre " + (i+1) + ": ");
            nombre[i] = teclado.next();
            System.out.println("Digite el numero " + (i+1) +  ": ");
            numero[i] = teclado.nextInt();
        }
    }
    public void ordenar() {
        for(int k = 0; k < numero.length; k++){
            for(int j = 0; j < numero.length -1; j++){
                if(numero[j] > numero[j+1]){
                    int auxNumero = numero[j];
                    numero[j] = numero[j+1];
                    numero[j+1] = auxNumero;

                    String auxNombre = nombre[j];
                    nombre[j] = nombre[j+1];
                    nombre[j+1] = auxNombre;
                }

            }
        }
    }

    public void imprimir() {
        System.out.println("Este es el resultado del ordenamiento:  ");
        for(int i = 0; i < numero.length; i++){
            System.out.println(nombre[i] + " " + numero[i] );
        }
    }
    
    public static void main(String args[]) {
        TallerOrdenar02 vector = new TallerOrdenar02();
        vector.cargar();
        vector.ordenar();
        vector.imprimir();
    }
}