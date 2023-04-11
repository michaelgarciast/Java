public class ArrayBusquedaBinaria2 {
    public static int busqueda(int vector[], int dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n-1;
        while(inf <= sup){
            centro = (sup + inf) /2;
            if(vector[centro] == dato){
                return centro;
            }else if(dato < vector[centro]){
                sup = centro +1;

            }else{
                inf = centro-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] vector = {21,22,23,24,25,26,27,28,29,30,31,32};
        int valorbuscado = 26;
        System.out.println(busqueda(vector, valorbuscado));
    }
}
