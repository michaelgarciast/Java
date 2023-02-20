import java.util.Vector;

public class Taller01 {
    public static void main(String args[]) {
        Vector <Double> sueldos = new Vector<Double>(15);

        sueldos.add(1000.0);
        sueldos.add(1200.0);
        sueldos.add(900.0);
        sueldos.add(1100.0);
        sueldos.add(800.0);
        sueldos.add(1300.0);
        sueldos.add(950.0);
        sueldos.add(1150.0);
        sueldos.add(850.0);
        sueldos.add(1400.0);
        sueldos.add(1050.0);
        sueldos.add(1250.0);
        sueldos.add(975.0);
        sueldos.add(1350.0);
        sueldos.add(950.0);

        double sueldoOperario5 = sueldos.get(4);
        System.out.println("El sueldo del operario 5 es: " + sueldoOperario5);

    }
}
