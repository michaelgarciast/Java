//Ejercicio 01
//Un empleador requiere guardar los sueldos de 15 operarios. 
//Realizar una pila tipo vector para acceder a cada elemento por medio del índice

//Librerias
import java.util.Scanner;
import java.util.Vector;


public class TallerUnoEjercicio01 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // Crear la pila
            Vector<Float> sueldos = new Vector<Float>(15);


            // Pedir los sueldos de los operarios y agregarlos a la pila
            for (int i = 0; i < 15; i++) {
                System.out.print("Ingrese el sueldo del operario " + (i+1) + ": ");
                float sueldo = sc.nextFloat();
                sueldos.add(sueldo);
            }

             // Acceder a cada elemento de la pila por medio del índice
             System.out.println("Los sueldos ingresados son:");
             for (int i = 0; i < sueldos.size(); i++) {
                 System.out.println("Operario " + (i+1) + ": $" + sueldos.get(i));
             }
        }

    }
}
