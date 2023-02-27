//Ejercicio 01
//Un empleador requiere guardar los sueldos de 15 operarios. 
//Realizar una pila tipo vector para acceder a cada elemento por medio del índice

//Librerias
import java.util.Scanner;
import java.util.Vector;
public class TallerUnoEjercicio01 {
        private Scanner teclado;
        private int cantOperarios = 5;

        public void sueldosOperarios() {
            // Crear la pila
            teclado = new Scanner(System.in);
            Vector<Float> sueldos = new Vector<Float>(cantOperarios);
            // Pedir los sueldos de los operarios y agregarlos a la pila
            for (int i = 0; i < cantOperarios; i++) {
                System.out.print("Ingrese el sueldo del operario " + (i+1) + ": ");
                float sueldo = teclado.nextFloat();
                sueldos.add(sueldo);
            }
            // Acceder a cada elemento de la pila por medio del índice
            System.out.println("Los sueldos ingresados son:");
            for (int i = 0; i < sueldos.size(); i++) {
                System.out.println("Operario " + (i+1) + ": $" + sueldos.get(i));
            }
            
        }
    public static void main(String args[]) {
        TallerUnoEjercicio01 vector = new TallerUnoEjercicio01();
        vector.sueldosOperarios();
        
        }

    }
