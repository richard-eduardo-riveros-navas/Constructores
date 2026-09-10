import Libro;
import uentaBancaria;
import Estudiante;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("   PROYECTO INTEGRADOR - TALLER DE CONSTRUCTORES ");
        System.out.println("=================================================\n");

        System.out.println("--- 1. OBJETOS CREADOS CON DIFERENTES CONSTRUCTORES ---");
        
        Libro libroDefault = new Libro(); 
        Libro libroParam = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 496);

        CuentaBancaria cuenta1 = new CuentaBancaria("987654321", "Corriente");
        CuentaBancaria cuenta2 = new CuentaBancaria("123456789", 1500000.50, "Ahorros");

        Estudiante estudiante1 = new Estudiante("Carlos Pérez", 20);
        Estudiante estudiante2 = new Estudiante("Maria Gómez", 22, "Programación Orientada a Objetos");

        System.out.println(libroDefault.toString()); 
        System.out.println(libroParam.toString()); 
        System.out.println(cuenta1.toString()); 
        System.out.println(cuenta2.toString()); 
        System.out.println(estudiante1.toString()); 
        System.out.println(estudiante2.toString()); 

        System.out.println("\n-------------------------------------------------");
        System.out.println("--- 2. INGRESO DE DATOS DINÁMICOS POR CONSOLA ---");
        System.out.println("-------------------------------------------------");

        System.out.println("\n[ Registro de un nuevo Libro ]");
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); 

        Libro libroUsuario = new Libro(titulo, autor, paginas);

        System.out.println("\n[ Registro de un nuevo Estudiante ]");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEst = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEst = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el curso asignado: ");
        String cursoEst = scanner.nextLine();

        Estudiante estudianteUsuario = new Estudiante(nombreEst, edadEst, cursoEst);

        System.out.println("\n=================================================");
        System.out.println("   RESUMEN DE OBJETOS CREADOS POR EL USUARIO     ");
        System.out.println("=================================================");
        System.out.println(libroUsuario.toString()); 
        System.out.println(estudianteUsuario.toString()); 

        scanner.close();
        System.out.println("\nPrograma finalizado correctamente.");
    }
}