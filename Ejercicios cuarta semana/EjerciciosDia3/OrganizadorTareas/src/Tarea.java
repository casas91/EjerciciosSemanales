import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea {
        private String nombre;
        private List<Tarea> subtareas;

        public Tarea(String nombre) {
            this.nombre = nombre;
            this.subtareas = new ArrayList<>();
        }
        public void agregarSubtarea(Tarea subtarea) {
            subtareas.add(subtarea);
        }

        public void agregarSubtareas(Scanner scanner, int nivel) {
            while (true) {
                System.out.print("¿Desea agregar una subtarea al nivel " + nivel + " de '" + this.nombre + "'? (S/N): ");
                String respuesta = scanner.nextLine().toUpperCase();

                if (respuesta.equals("S")) {
                    System.out.print("Ingrese el nombre de la subtarea: ");
                    String nombreSubtarea = scanner.nextLine();
                    Tarea subtarea = new Tarea(nombreSubtarea);
                    this.agregarSubtarea(subtarea);

                    //Recursividad para agregar subtareas a la subtarea actual
                    subtarea.agregarSubtareas(scanner, nivel + 1);
                } else {
                    break;
                }
            }
        }

        public void mostrarEstructura(String espacioJerarquia) {
            System.out.println(espacioJerarquia + nombre);
            for (Tarea subtarea : subtareas) {
                subtarea.mostrarEstructura(espacioJerarquia + "  ");
            }
        }
    }



