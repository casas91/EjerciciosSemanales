import java.util.Scanner;

public class EjercicioN1 {
    public static void main(String[] args) {
        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();

        if(edad>=18) {
            System.out.println("Puedes entrar al recital");
        }
        else {
            System.out.println("No puedes entrar al recital");
        }


    }
}
