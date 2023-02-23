//Librerias
import java.util.*;
public class TallerEjemplo {

    private Scanner teclado;
    private float[] altura;
    private float promedio;

    public void dataEmpleados(){
        teclado = new Scanner(System.in);
        altura = new float[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese la altura del empleado: " + (i+1) + ": ");
            altura[i] = teclado.nextFloat();
        }
    }
    public void promedio() {
        float suma = 0;
        for(int i = 0; i < 5; i++){
            suma = suma + altura[i];
        }
        promedio = suma / 5;
    }
    public void calcular(){
        int mayores = 0;
        int menores = 0;
        for(int i = 0; i < 5; i++){
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
        TallerEjemplo vector = new TallerEjemplo();
        vector.dataEmpleados();
        vector.promedio();
        vector.calcular();
    }
}
