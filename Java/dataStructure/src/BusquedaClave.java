import java.util.*;

public class BusquedaClave {
    private String[] jugadores = new String[15];
    private static Scanner teclado;
    
    // Constructor que inicializa el arreglo con nombres de jugadores
    public BusquedaClave() {
        jugadores[0] = "Messi";
        jugadores[1] = "Ronaldo";
        jugadores[2] = "Neymar";
        jugadores[3] = "Mbappé";
        jugadores[4] = "Benzema";
        jugadores[5] = "Lewandowski";
        jugadores[6] = "Muller";
        jugadores[7] = "Salah";
        jugadores[8] = "Mané";
        jugadores[9] = "Hazard";
        jugadores[10] = "Kanté";
        jugadores[11] = "Luis Diaz";
        jugadores[12] = "Rashford";
        jugadores[13] = "Haaland";
        jugadores[14] = "Dibala";
    }
    
    // Método para buscar un jugador en el arreglo utilizando una clave
    public int buscar(String clave) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].equalsIgnoreCase(clave)) {
                return i;
            }
        }
        return -1; // Retorna -1 si no se encuentra la clave en el arreglo
    }
    
    // Método para imprimir el arreglo
    public void imprimir() {
        System.out.print("[ ");
        for (int i = 0; i < jugadores.length; i++) {
            System.out.print(jugadores[i] + " ");
        }
        System.out.println("]");
    }
    
    // Método main para probar la clase
    public static void main(String[] args) {
        BusquedaClave bj = new BusquedaClave();
        bj.imprimir();
        
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del jugador a buscar: ");
        String clave = teclado.nextLine();
        int resultado = bj.buscar(clave);
        if (resultado == -1) {
            System.out.println("El jugador " + clave + " no se encontró en el arreglo.");
        } else {
            System.out.println("El jugador " + clave + " se encontró en la posición " + resultado + " del arreglo.");
        }
    }
} 
