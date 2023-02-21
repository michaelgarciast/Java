import java.util.*;

public class EjercicioCola {
    public static void main(String args[]) {
        //Crear cola vacia
        Stack<Integer> Stack = new Stack<>();
        //Usar push para crear elementos en la cola
        Stack.push(15);
        Stack.push(16);
        Stack.push(17);
        Stack.push(18);

        //
        System.out.println("Inicializar cola es: " + Stack);
        //Elemento 
        System.out.println("El elemento supedaro es: " + Stack.peek());
        //Fin
        System.out.println("Final de la cola es: " + Stack);

    }
}
