import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir ingreso de numeros
        System.out.print("Ingrese el primer número entero: ");
        int nro1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int nro2 = scanner.nextInt();

        // Operaciones
        int suma = nro1 + nro2;
        int resta = nro1 - nro2;
        int multiplicacion = nro1 * nro2;
        double division = 0;

        // Para evitar dividir por cero
        if (nro2 != 0) {
            division = (double) nro1 / nro2;
        } else {
            System.out.println("No se puede dividir por 0.");
        }

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (nro2 != 0) {
            System.out.println("División: " + division);
        }

    }
}