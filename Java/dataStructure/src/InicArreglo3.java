public class InicArreglo3 {
    public static void main(String args[]) {
        int LONGITUD_ARREGLO = 10;
        int arreglo[] = new int[LONGITUD_ARREGLO]; //crear arreglo
        //Imprimir el valor de cada elementodel arreglo
        for(int contador = 0; contador < arreglo.length; contador++){
            arreglo[contador] = 2 + 2 * contador;
            System.out.printf("%s%8s\n", "Indice", "Valor");//Encabezado de columnas
            //Imprime el valor de cada elemento del arreglo
        }
        for(int contador = 0; contador < arreglo.length; contador ++){
            System.out.printf("%5d%8d\n", contador, arreglo[contador]);
        }//Fin de main
    }// Fin de class InicArreglo
}
