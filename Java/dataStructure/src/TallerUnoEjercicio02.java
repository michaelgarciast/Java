//Librerias
import java.util.*;
public class TallerUnoEjercicio02 {

    private Scanner teclado;
    private float[] altura;
    private float promedio;
    private int cantEmpleados = 5;

    public void dataEmpleados(){
        teclado = new Scanner(System.in);
        altura = new float[cantEmpleados];
        for(int i = 0; i < cantEmpleados; i++){
            System.out.println("Ingrese la altura del empleado: " + (i+1) + ": ");
            altura[i] = teclado.nextFloat();
        }
    }
    public void promedio() {
        float suma = 0;
        for(int i = 0; i < cantEmpleados; i++){
            suma = suma + altura[i];
        }
        promedio = suma / cantEmpleados;
    }
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
        System.out.println("El promedio de alturas es: " + promedio);
        System.out.println("Hay " + mayores + " empleados más altos que el promedio");
        System.out.println("Hay " + menores + " empleados más bajos que el promedio");
    }
    public static void main(String args[]) {
        TallerUnoEjercicio02 vector = new TallerUnoEjercicio02();
        vector.dataEmpleados();
        vector.promedio();
        vector.calcular();
    }
}
