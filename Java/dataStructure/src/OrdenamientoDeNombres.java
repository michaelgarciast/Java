//Librerias
import java.util.*;

public class OrdenamientoDeNombres {
    private static Scanner teclado;
    public static void main(String[] args) {
        //Inicializar Variables
        int cantUser = 5;
        String[] nombreUser;
        // Nombres de usuarios
        nombreUser = new String[cantUser];
        teclado = new Scanner(System.in);
        // Ingresar nombres de usuario
        for(int i = 0; i < cantUser; i++){
            System.out.println("Ingresar el nombre de usuario #" + (i+1)+ ": ");
            nombreUser[i] = teclado.nextLine();
        }

        // Vector sin ordenar
        System.out.println("Vector sin ordenar: " + Arrays.toString(nombreUser));

        // Ordenar vector del método Shell
        int incremento = nombreUser.length / 2;
        // Definir la secuencia
        while(incremento > 0){
            for(int i = incremento; i<nombreUser.length; i++){
                String aux = nombreUser[i];
                int j = i;
                while(j >= incremento && nombreUser[j - incremento].compareTo(aux) > 0){
                    nombreUser[j] = nombreUser[j - incremento];
                    j -= incremento; 
                }
                nombreUser[j] = aux;
            }
            incremento /= 2;
        }

        // Vector ordenado
        System.out.println("Vector ordenado: " + Arrays.toString(nombreUser));
        
    }
    
}






