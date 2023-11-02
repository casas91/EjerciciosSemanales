import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        int Diassemana = 7;
        double[] temperaturas = new double[Diassemana];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Diassemana; i++) {
            System.out.print("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        //promedio
        double suma = 0;
        for (int i = 0; i < Diassemana; i++) {
            suma += temperaturas[i];
        }
        //Final
        double promedio = suma / Diassemana;

        System.out.println("La temperatura máxima promedio de la última semana fue: " + promedio + " grados.");

    }
}

