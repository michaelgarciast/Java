//Librerias
import java.util.*;

public class NominaSueldos {
    // Declaracion de variables
    private Scanner teclado;
    private int cantSueldos = 10;
    private double [] nomina;

    public void sueldos() {
        teclado  = new Scanner(System.in);
        nomina = new double[cantSueldos];
        // Llenar vector con sueldos
        for (int i = 0; i < nomina.length; i++) {
            System.out.print("Ingrese el sueldo " + (i+1) + ": ");
            nomina[i] = teclado.nextDouble();
        }
        
    }
    public void ordenar() {
        for(int k = 0; k < nomina.length; k++){
            for(int j = 0; j < nomina.length -1; j++){
                if(nomina[j] > nomina[j+1]){
                    Double auxNomina = nomina[j];
                    nomina[j] = nomina[j+1];
                    nomina[j+1] = auxNomina;

                }

            }
        }
    }
    public void imprimir() {
        System.out.println("Vector de sueldos ordenado de menor a mayor:");
        for (int i = 0; i < nomina.length; i++) {
            System.out.println(nomina[i]);
        }
    }
    
    public static void main(String args[]) {
        NominaSueldos vector = new NominaSueldos();
        vector.sueldos();
        vector.ordenar();
        vector.imprimir();
    }
}