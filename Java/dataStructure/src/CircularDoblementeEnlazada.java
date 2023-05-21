//Libreria
import java.util.*;

public class CircularDoblementeEnlazada {
    private Node head;

    // Clase interna Node que representa un nodo en la lista
    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Método para agregar un nodo a una lista vacía
    public void addToEmpty(int data) {
        Node newNode = new Node(data);
        newNode.prev = newNode;
        newNode.next = newNode;
        head = newNode;
    }

    // Método para agregar un nodo al final de la lista
    public void add(int data) {
        if (head == null) {
            addToEmpty(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;
    }

    // Método para dividir todos los nodos de la lista por un número n
    public void divideByN(int n) {
        if (head == null) {
            return;
        }

        Node currentNode = head;
        boolean allDivisible = false;

        while (!allDivisible) {
            allDivisible = true;
            currentNode.data = currentNode.data / n;

            if (currentNode.data % n != currentNode.data) {
                allDivisible = false;
            }

            currentNode = currentNode.next;

            if (currentNode == head) {
                break;
            }
        }
    }

    // Método para mostrar los elementos de la lista
    public void displayList() {
        if (head == null) {
            return;
        }

        Node currentNode = head;

        do {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        } while (currentNode != head);

        System.out.println();
    }

    // Insertar por teclado
    private static Scanner teclado;


    public static void main(String[] args) {
        CircularDoblementeEnlazada list = new CircularDoblementeEnlazada();

        // Se agregan elementos a la lista
        list.add(35);
        list.add(15);
        list.add(20);
        list.add(50);
        list.add(25);

        // Se muestra la lista original
        System.out.println("Lista doblemente enlazada original:");
        list.displayList();

        // Se solicita al usuario ingresar el número por el cual se desea dividir
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el número por el cual desea dividir: ");
        int divisor = teclado.nextInt();
        
        // Se divide cada elemento de la lista por el divisor especificado
        list.divideByN(divisor);

        // Se muestra la lista después de la división
        System.out.println("Resultado en la lista después de la división por " + divisor + ":");
        list.displayList();
    }
}
