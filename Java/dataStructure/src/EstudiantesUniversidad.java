import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Estudiante {
    private String nombre;
    private String apellido;

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}

public class EstudiantesUniversidad {
    private List<Estudiante> estudiantes;

    public EstudiantesUniversidad() {
        estudiantes = new LinkedList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        Collections.sort(estudiantes, (e1, e2) -> e1.getApellido().compareTo(e2.getApellido()));
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    public boolean existeApellidoRepetido(String apellido) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getApellido().equalsIgnoreCase(apellido)) {
                contador++;
                if (contador >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public int contarEstudiantes() {
        return estudiantes.size();
    }

    public void imprimirEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getApellido() + ", " + estudiante.getNombre());
        }
    }

    public static void main(String[] args) {
        EstudiantesUniversidad lista = new EstudiantesUniversidad();
        Scanner scanner = new Scanner(System.in);
    
        int opcion = 0;
    
        while (opcion != 5) {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Verificar apellido repetido");
            System.out.println("4. Contar estudiantes");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
    
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del estudiante: ");
                    String apellido = scanner.nextLine();
                    Estudiante nuevoEstudiante = new Estudiante(nombre, apellido);
                    lista.agregarEstudiante(nuevoEstudiante);
                    System.out.println("Estudiante agregado correctamente.");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Ingrese el apellido del estudiante a eliminar: ");
                    String apellidoEliminar = scanner.nextLine();
                    Estudiante estudianteEliminar = null;
                    for (Estudiante estudiante : lista.estudiantes) {
                        if (estudiante.getApellido().equalsIgnoreCase(apellidoEliminar)) {
                            estudianteEliminar = estudiante;
                            break;
                        }
                    }
                    if (estudianteEliminar != null) {
                        lista.eliminarEstudiante(estudianteEliminar);
                        System.out.println("Estudiante eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró ningún estudiante con ese apellido.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Ingrese el apellido a verificar: ");
                    String apellidoVerificar = scanner.nextLine();
                    boolean apellidoRepetido = lista.existeApellidoRepetido(apellidoVerificar);
                    if (apellidoRepetido) {
                        System.out.println("El apellido " + apellidoVerificar + " se repite en la lista.");
                    } else {
                        System.out.println("El apellido " + apellidoVerificar + " no se repite en la lista.");
                    }
                    System.out.println();
                    break;
                case 4:
                    int cantidadEstudiantes = lista.contarEstudiantes();
                    System.out.println("La cantidad de estudiantes es: " + cantidadEstudiantes);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    System.out.println();
                    break;
            }
        }
    
        scanner.close();
    }   
}