public class InicArreglo {
    public static void main(String args[]) {
        int arreglo[]; //Declaracion de un arreglo en el mismo nombre
        arreglo = new int[10]; //Crear espacio para el arreglo
        System.out.printf("%s%8s\n", "Indice", "Valor");//Encabezado de columnas

        //Imprimir el valor de cada elementodel arreglo
        for(int contador = 0; contador < arreglo.length; contador++){
            System.out.printf("%5d%8d\n", contador, arreglo[contador]);
        }//Fin de main
    }// Fin de class InicArreglo
}
