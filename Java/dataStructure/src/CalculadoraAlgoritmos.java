//Librerias
import java.util.*;

public class CalculadoraAlgoritmos {

    // Declaracion de variables
    private Scanner teclado;
    private int number1;
    private int number2;
    private int resultOperation = 0;
    private char operation;

    // Carga datos o numeros de la operación
    public void dataOperationLoad() {
        teclado = new Scanner(System.in);
            System.out.println("Ingrese el #1: ");
            number1 = teclado.nextInt();
            System.out.println("Ingrese el #2: ");
            number2 = teclado.nextInt();
    }
    // Seleccionar tipo de operación
    public void operationType() {
        System.out.println("Seleccione el tipo de operación: (+ - * /): ");
        // Variable operación tipo char para guardar caracteres
        operation = teclado.next().charAt(0);
        // Variable resultado
        resultOperation = 0;
        // Condicional Switch para validar las operaciones cargadas
        switch (operation){
            case '+':
                resultOperation = number1 + number2;
                break;
            case '-':
                resultOperation = number1 - number2;
                break;
            case '*':
                resultOperation = number1 * number2;
                break;
            case '/':   
                resultOperation = number1 / number2;
                break;
            default:
            // Error en la validación
                System.out.println("Hay un error en la Operación");
                // Retornar valor en memoria
                return;
        }
    }
    //Imprimir resultado de la operación 
    public void printOperation() {
        System.out.println(number1 + " " + operation + " " + number2 + " = " + resultOperation);
    }
    //Inicializacion de funciones
    public static void main(String args[]){
        CalculadoraAlgoritmos vector = new CalculadoraAlgoritmos();
        vector.dataOperationLoad();
        vector.operationType();
        vector.printOperation();
    }
}