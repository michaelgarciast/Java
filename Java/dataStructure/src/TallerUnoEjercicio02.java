//Librerias
import java.util.*;
public class TallerUnoEjercicio02 {

    //Declaracion de variables
    private Scanner teclado;
    private float[] altura;
    private float promedio;
    private int cantEmpleados = 20;

    //Funcion para ingresar los datos de empleados
    public void dataEmpleados(){
        teclado = new Scanner(System.in);
        altura = new float[cantEmpleados];
        for(int i = 0; i < cantEmpleados; i++){
            System.out.println("Ingrese la altura del empleado: " + (i+1) + ": ");
            altura[i] = teclado.nextFloat();
        }
    }
    //Funcion para sacar promedio 
    public void promedio() {
        float suma = 0;
        for(int i = 0; i < cantEmpleados; i++){
            suma = suma + altura[i];
        }
        promedio = suma / cantEmpleados;
    }
    //Funcion para calcular la cantidad de mayores y menores
    public void calcular(){
        int mayores = 0;
        int menores = 0;
        for(int i = 0; i < cantEmpleados; i++){
            if(altura[i] > promedio){
                mayores ++;
            }else if(altura[i] < promedio){
                menores ++;
            }
        }
        //Datos de salida
        System.out.println("El promedio de alturas es: " + promedio);
        System.out.println("Hay " + mayores + " empleados más altos que el promedio");
        System.out.println("Hay " + menores + " empleados más bajos que el promedio");
    }
    //Inicializacion de funciones
    public static void main(String args[]) {
        TallerUnoEjercicio02 vector = new TallerUnoEjercicio02();
        vector.dataEmpleados();
        vector.promedio();
        vector.calcular();
    }
}
