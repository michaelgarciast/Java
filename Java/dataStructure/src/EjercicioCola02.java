import java.util.*;

public class EjercicioCola02 {
    Scanner teclado;
    int [] sueldo;
    public void cargar() {
        teclado = new Scanner(System.in);
        sueldo = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Ingrese el sueldo");
            sueldo[i] = teclado.nextInt();
        }
    }
    public void imprimir() {
        for(int i = 0; i<= 5; i ++){
            System.out.println(sueldo[i]);
        }
    }
    public static void main(String args[]) {
        EjercicioCola02 Cola = new EjercicioCola02();
        Cola.cargar();
        Cola.imprimir();
    }
}
