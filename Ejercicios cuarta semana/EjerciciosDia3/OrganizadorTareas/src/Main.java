import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Organizador de Tareas");

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la tarea principal: ");
        String nombreTareaPrincipal = scan.nextLine();
        Tarea tareaPrincipal = new Tarea(nombreTareaPrincipal);

        tareaPrincipal.agregarSubtareas(scan, 0);

        System.out.println("Estructura de Tareas:");
        tareaPrincipal.mostrarEstructura(" ");

        scan.close();
    }
}