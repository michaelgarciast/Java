// public class ArrayBusquedaBinaria2 {
//     public static int busqueda(int vector[], int dato) {
//         int n = vector.length;
//         int centro, inf = 0, sup = n-1;
//         while(inf <= sup){
//             centro = (sup + inf) /2;
//             if(vector[centro] == dato){
//                 return centro;
//             }else if(dato < vector[centro]){
//                 sup = centro +1;

//             }else{
//                 inf = centro-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] vector = {21,22,23,24,25,26,27,28,29,30,31,32};
//         int valorbuscado = 26;
//         System.out.println(busqueda(vector, valorbuscado));
//     }
// }

public class ArrayBusquedaBinaria2 {
    
    public static int busqueda(String vector[], String nombre) {
        int n = vector.length;
        int centro, inf = 0, sup = n-1;
        while(inf <= sup){
            centro = (sup + inf) /2;
            if(vector[centro].compareTo(nombre) == 0){
                return centro;
            } else if(nombre.compareTo(vector[centro]) < 0){
                sup = centro - 1;
            } else{
                inf = centro + 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String[] vector = {"Albeiro De Jesus", "Cristian Mateo", "Daniel Alexander", "David Santiago", "Deiby Andres", "Jeisson Fabian", "Jhoan David", "Jose Manuel", "Jose Sebastian", "Juan Sebastian Camilo", "Karen Juliana", "Kevin Steven", "Luis Jonnathan", "Marlon", "Marlon David", "Martin", "Martin Alejandro", "Mateo", "Michael Steven", "Yeraldin"};
        String nombreBuscado = "Jose Manuel";
        int indice = busqueda(vector, nombreBuscado);
        if(indice == -1){
            System.out.println("El estudiante no se encuentra en la lista");
        } else{
            System.out.println("El siguiente estudiante a " + nombreBuscado + " es " + vector[indice+1]);
        }
    }
}