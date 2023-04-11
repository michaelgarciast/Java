public class ArrayBusquedaBinaria{
    public static void main(String[]args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int valorbuscado = 11;
        System.out.println(BusquedaBinaria(arreglo,valorbuscado));
    }
    public static int BusquedaBinaria(int arreglo[], int elemento) {
        int primero,centro,ultimo, valorcentro;
        primero = 0;
        ultimo = arreglo.length -1;
        while(primero <= ultimo){
            centro = (primero + ultimo) / 2;
            valorcentro = arreglo[centro];
            System.out.println("Comprando a: " + elemento + " con " + arreglo[centro] );

            if(elemento == valorcentro){
                return centro;
            }
            else if(elemento < valorcentro){
                ultimo = centro -1;
            }else {
                primero = centro + 1;

            }
        }
        return -1;
    }
}

