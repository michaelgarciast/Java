//Libreria
import java.util.*;

public class Quiz {
    //Inicializar variables
    private Scanner teclado;
    private String nombreEstudiante;

    // Variables notas
    private static double[] notas;
    private double[] notasSociales;
    private double[] notasEspanol;
    private double[] notasIngles;
    private double[] notasCatedra;
    private double[] notasMatematicas;

    //Varibles promedio y resultado materias
    private String resultadoSociales;
    private String resultadoEspanol;
    private String resultadoIngles;
    private String resultadoCatedra;
    private String resultadoMatematicas;
    
    private double promedioSociales;
    private double promedioEspanol;
    private double promedioIngles;
    private double promedioCatedra;
    private double promedioMatematicas;

    private int materiasAprobadas;


    // Función para ingresar datos estudiante y notas
    public void ingresarDatos() {
        
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        nombreEstudiante = teclado.nextLine();

        // Ingreso de notas de asignaturas
        notasSociales = ingresarNotas("Sociales", teclado);
        notasEspanol = ingresarNotas("Español", teclado);
        notasIngles = ingresarNotas("Inglés", teclado);
        notasCatedra = ingresarNotas("Catedra", teclado);
        notasMatematicas = ingresarNotas("Matematicas", teclado);

        // Cálculo de promedio y resultado por asignatura
        promedioSociales = calcularPromedio(notasSociales);
        resultadoSociales = obtenerResultado(promedioSociales);

        promedioEspanol = calcularPromedio(notasEspanol);
        resultadoEspanol = obtenerResultado(promedioEspanol);

        promedioIngles = calcularPromedio(notasIngles);
        resultadoIngles = obtenerResultado(promedioIngles);
        
        promedioCatedra = calcularPromedio(notasCatedra);
        resultadoCatedra = obtenerResultado(promedioCatedra);
        
        promedioMatematicas = calcularPromedio(notasMatematicas);
        resultadoCatedra = obtenerResultado(promedioMatematicas);
    }

    // Función para ingresar las notas de una asignatura
    public static double[] ingresarNotas(String asignatura, Scanner teclado) {
        System.out.println("Ingrese las notas de " + asignatura + ":");
        notas = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota del corte # " + (i + 1) + ": ");
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

    public void CalcularPorcentaje() {
        if (resultadoSociales.equals("Aprobado")) {
            materiasAprobadas++;
        }
        if (resultadoEspanol.equals("Aprobado")) {
            materiasAprobadas++;
        }
        if (resultadoIngles.equals("Aprobado")) {
            materiasAprobadas++;
        }
        if (resultadoCatedra.equals("Aprobado")) {
            materiasAprobadas++;
        }
        if (resultadoMatematicas.equals("Aprobado")) {
            materiasAprobadas++;
        }
        double promedioTotal = (promedioSociales + promedioEspanol + promedioIngles + promedioCatedra + promedioMatematicas) / 5.0;
            if (materiasAprobadas == 2 || materiasAprobadas == 3) {
                promedioTotal *= 0.9;
                System.out.println("El estudiante recibió un descuento del 10% en el promedio total debido a que aprobó " + materiasAprobadas + " materias");
            }
            System.out.println("El promedio total del estudiante es: " + Math.floor(promedioTotal));

        }
    

    // Función Impresión de los resultados asignatura
    public void imprimirDatos() {
        System.out.println("Nombre del estudiante: " + nombreEstudiante);
        System.out.println("El estudiante fue " + resultadoSociales + " en la asignatura de Sociales con un promedio de: " +  Math.floor(promedioSociales));
        System.out.println("El estudiante fue " + resultadoEspanol + " en la asignatura de Español con un promedio de: " +  Math.floor(promedioEspanol) );
        System.out.println("El estudiante fue " + resultadoIngles + " en la asignatura de Ingles con un promedio de: " +  Math.floor(promedioIngles));
        System.out.println("El estudiante fue " + resultadoCatedra + " en la asignatura de Ingles con un promedio de: " +  Math.floor(promedioIngles) );
        System.out.println("El estudiante fue " + resultadoMatematicas + " en la asignatura de Ingles con un promedio de: " +  Math.floor(promedioIngles));
    }
    //Inicializacion de funciones
    public static void main(String[] args) {
        Quiz vector = new Quiz();
        vector.ingresarDatos();
        vector.imprimirDatos();
    }
}
