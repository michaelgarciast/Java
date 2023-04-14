//Libreria
import java.util.*;

public class CalificacionesEstudiante {
    //Inicializar variables
    private Scanner teclado;
    private String nombreEstudiante;
    private String carreraUniversitaria;
    // Variables notas
    private static double[] notas;
    private double[] notasSociales;
    private double[] notasEspanol;
    private double[] notasIngles;

    private String resultadoSociales;
    private String resultadoEspanol;
    private String resultadoIngles;

    // Función para ingresar datos estudiante y notas
    public void ingresarDatos() {
        
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        nombreEstudiante = teclado.nextLine();

        System.out.println("Ingrese la carrera del estudiante: ");
        carreraUniversitaria = teclado.nextLine();

        // Ingreso de notas de asignaturas
        notasSociales = ingresarNotas("Sociales", teclado);
        notasEspanol = ingresarNotas("Español", teclado);
        notasIngles = ingresarNotas("Inglés", teclado);

        // Cálculo de promedio y resultado por asignatura
        double promedioSociales = calcularPromedio(notasSociales);
        resultadoSociales = obtenerResultado(promedioSociales);

        double promedioEspanol = calcularPromedio(notasEspanol);
        resultadoEspanol = obtenerResultado(promedioEspanol);

        double promedioIngles = calcularPromedio(notasIngles);
        resultadoIngles = obtenerResultado(promedioIngles);
    }

    // Función para ingresar las notas de una asignatura
    public static double[] ingresarNotas(String asignatura, Scanner teclado) {
        System.out.println("Ingrese las notas de " + asignatura + ":");
        notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese la nota del período " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }
        return notas;
    }

    // Función para calcular el promedio de un conjunto de notas
    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
    // Función para obtener el resultado (aprobado/desaprobado) según el promedio
    public static String obtenerResultado(double promedio) {
        if (promedio >= 3.0 && promedio <= 5.0) {
            return "Aprobado";
        } else if (promedio >= 1.0 && promedio <= 2.9) {
            return "Desaprobado";
        } else {
            return "Error: El promedio está fuera de rango";
        }
    }
    
    // Función Impresión de los resultados asignatura
    public void imprimirDatos() {
        System.out.println("Nombre del estudiante: " + nombreEstudiante);
        System.out.println("Carrera del estudiante: " + carreraUniversitaria);
        System.out.println("Asignatura Sociales: " + resultadoSociales);
        System.out.println("Asignatura Español: " + resultadoEspanol);
        System.out.println("Asignatura Inglés: " + resultadoIngles);
    }

    //Inicializacion de funciones
    public static void main(String[] args) {
        CalificacionesEstudiante vector = new CalificacionesEstudiante();
        vector.ingresarDatos();
        vector.imprimirDatos();
    }
}
