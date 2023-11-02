import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Importamos clase scanner
        Scanner scanner = new Scanner(System.in);

        //Variables
        boolean seguir = true;
        int fila;
        int asiento;
        int continuarReserva;

        //Declaramos la matriz
        String[][] asientos = new String[5][5];

        // Recorremos la matriz

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                asientos[i][j] = "O";
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
        //Bucle centinela para repetir proceso hasta que no se quieran realizar mas reservas.
        while (seguir == true) {

            //Pedimos el numero de fila
            System.out.println("Introduzca la fila que quiere reservar entre 0 y 4");
            fila = scanner.nextInt();

            //Verificación de que la fila introducida es correcta.
            while (fila < 0 || fila > 4) {
                System.out.println("Introduzca un número de fila válido:");
                fila = scanner.nextInt();
            }
            //Pedimos numero de asiento

            System.out.println("Introduzca el asiento que quiere reservar (entre 0 y 4)");
            asiento = scanner.nextInt();

            //Verificacion de que el asiento introducido es correcto.
            while(asiento < 0 || asiento > 4){
                System.out.println("Introduzca un número de asiento válido:");
                asiento = scanner.nextInt();
            }
            // Comprobacion de si el asiento está disponible o no.
            while (Objects.equals(asientos[fila][asiento], " X ")){
                System.out.println("El asiento ya está reservado, seleccione otro.");

                System.out.println("Introduzca la fila del asiento que quiere reservar (entre 0 y 4)");
                fila = scanner.nextInt();

                while(fila < 0 || fila > 4){
                    System.out.println("Introduzca un número de fila válido:");
                    fila = scanner.nextInt();
                }

                System.out.println("Introduzca el asiento que quiere reservar (entre 0 y 4)");
                asiento = scanner.nextInt();

                while(asiento < 0 || asiento > 4){
                    System.out.println("Introduzca un número de asiento válido:");
                    asiento = scanner.nextInt();
                }
            }
            //Definimos cuando un asiento ya ha sido reservado
            asientos[fila][asiento] = " X ";
            for(int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos[0].length; j++) {
                    System.out.print(asientos[i][j]);
                }
                System.out.println("");
            }
                //Preguntamos si quieren seguir reservando o no
                System.out.println("¿Desea continuar con la reserva? (Presione 1 para continuar o cualquier otra tecla para finalizar)");
                continuarReserva = scanner.nextInt();
                if(continuarReserva != 1) {
                    seguir = false;
            }
            }
            }

        }
