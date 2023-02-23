//Ejercicio 01
//Realizar una pila con los sueldos de unos empleados,
//cuando se ejecute el programa se debe pedir la cantidad de sueldos a ingresar.

//Librerias
import java.util.Scanner;
import java.util.Stack;

public class TallerDosEjercicio01 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // Pedir la cantidad de sueldos a ingresar
            System.out.print("Ingrese la cantidad de sueldos: ");
            int cantidadSueldos = sc.nextInt();

            // Crear una pila para almacenar los sueldos
            Stack<Double> sueldos = new Stack<>();
            
            // Pedir los sueldos y agregarlos a la pila
            for(int i = 0; i<cantidadSueldos; i++){
                System.out.print("Ingrese el sueldo del empleado " + (i+1) + ": ");
                double sueldo = sc.nextDouble();
                sueldos.push(sueldo);
            }

            // Mostrar los sueldos de la pila
            System.out.println("Los sueldos ingresados son: ");
            while(!sueldos.isEmpty()){
                double sueldo = sueldos.pop();
                System.out.println(sueldo);
            }
        }
    }
}
