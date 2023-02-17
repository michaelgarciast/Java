
import java.util.Scanner;

public class InicArreglo4 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Inserte la longitud del arreglo: ");
            int longitud = teclado.nextInt();
            int numero [] = new int[longitud];
            int num = 0;
            for(int i = 0; i< numero.length; i++){
                System.out.println("Inserte un numero en la posicion " + i);
                do{
                    num = teclado.nextInt();
                    if(!(num >= 0 && num <= 10)){
                        System.out.println("Hay un error");
                    }
                }
                while(!(num > 0 && num <= 10));
                numero [i] = num;
            }

            System.out.println("Estos son los numeros digitados por teclado: ");
            for(int i = 0; i<numero.length; i++){
                System.out.println(numero[i]);
            }
        }
        
    }
    
}
