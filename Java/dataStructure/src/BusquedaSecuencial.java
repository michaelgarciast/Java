//Librerias
import javax.swing.*;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int arreglo[] = {4, 1, 5, 2, 3, 56, 25, 48, 41, 92, 99};
        int data;
        boolean bandera;
        bandera = false;
        data = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        int i = 0;
        while((i < 10 ) && (bandera == false)){
            if(arreglo[i] == data){
                bandera = true;
            }
            i ++;
        }
        if(bandera == false){
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en la lista");
        }else{
            JOptionPane.showMessageDialog(null, "El numero  es: " + (i - 1));
        }
    }
}