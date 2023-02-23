//Ejercicio 02
//La secretaria necesita saber cuántos empleados son más altos que el promedio y cuántas más bajos. 
//Definir un vector de 20 componentes de tipo float que representen las alturas de los empleados. 

//Librerias
import java.util.*;

public class TallerUnoEjercicio02 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // Definir el vector de alturas
            float[] alturas = new float[20];

            // Pedir las alturas de los empleados y agregarlas al vector
            for (int i = 0; i < alturas.length; i++) {
                System.out.print("Ingrese la altura del empleado " + (i+1) + ": ");
                alturas[i] = sc.nextFloat();
            }
            // Calcular el promedio de alturas
            float promedio = 0;
            for (float altura : alturas) {
                promedio += altura;
            }
            promedio /= alturas.length;

            // Contar cuántos empleados son más altos o más bajos que el promedio
            int mayores = 0;
            int menores = 0;
            for (float altura : alturas) {
                if (altura > promedio) {
                    mayores++;
                } else if (altura < promedio) {
                    menores++;
                }
            }
            // Mostrar los resultados
            System.out.println("El promedio de alturas es: " + promedio);
            System.out.println("Hay " + mayores + " empleados más altos que el promedio");
            System.out.println("Hay " + menores + " empleados más bajos que el promedio");
        }
    }
        
}
