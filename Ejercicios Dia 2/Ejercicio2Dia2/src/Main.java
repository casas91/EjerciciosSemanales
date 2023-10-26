import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double precioproducto;
        double preciototal = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Ingrese precio del producto, para terminar su compra ingrese 0:");
            precioproducto = scanner.nextDouble();
            if (precioproducto <= 0) {
                break;
            }
            preciototal += precioproducto;
        }
        System.out.println("El precio de su compra es:" +preciototal);
    }
}

