//Ejercicio 01
//Realizar una pila con los sueldos de unos empleados,
//cuando se ejecute el programa se debe pedir la cantidad de sueldos a ingresar.

//Librerias
import java.util.*;

public class TallerDosEjercicio01 {
    private Scanner teclado;

    public void cantSueldos() {
        teclado = new Scanner(System.in);
        // Pedir la cantidad de sueldos a ingresar
        System.out.print("Ingrese la cantidad de sueldos: ");
        int cantidadSueldos = teclado.nextInt();

        // Crear una pila para almacenar los sueldos
        Stack<Double> sueldos = new Stack<>();
        for(int i = 0; i<cantidadSueldos; i++){
            System.out.print("Ingrese el sueldo del empleado " + (i+1) + ": ");
            double sueldo = teclado.nextDouble();
            sueldos.push(sueldo);
        }
        // Mostrar los sueldos de la pila
        System.out.println("Los sueldos ingresados son: ");
            while(!sueldos.isEmpty()){
                double sueldo = sueldos.pop();
                System.out.println(sueldo);
            }
    }
    public static void main(String args[]) {
        TallerDosEjercicio01 vector = new TallerDosEjercicio01();
        vector.cantSueldos();
            
            
            
        }
    }
