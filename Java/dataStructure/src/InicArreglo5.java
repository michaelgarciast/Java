//Crear un arreglo que contenga la suma y el promediode los datos en el arreglo.
public class InicArreglo5 {
    public static void main(String args[]) {
        int numero [] = new int [10];
        int suma = 0;
        int promedio;
        for(int i = 0; i < numero.length; i++){
            numero[i] = i+1;
            suma += numero[i];
        }
        System.out.println("La suma es: " + suma);
        promedio = suma / numero.length;
        System.out.println("El promedio es: " + promedio);
    }
}