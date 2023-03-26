public class Taller02 {

    public static int suma(int x, int y) {
        return x+y;
    }
    public static int suma(int x, int y, int z) {
        return x+y+z;
    }
    public static void main(String args[]) {
        System.out.println(suma(5, 4) + " " + suma(2, 3, 4));
    }
}
