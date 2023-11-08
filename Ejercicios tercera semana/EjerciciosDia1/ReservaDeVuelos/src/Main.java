import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaramos las variables
        String nombreYApellidos;
        String destino;
        String fecha;
        int asientos;

        //Declaramos el scanner
        Scanner scanner = new Scanner(System.in);

        //Se solicitan los datos necesarios al usuario
        System.out.println("--RESERVA DE VUELOS--");
        System.out.println("Introduzca su nombre y apellidos:");
        nombreYApellidos = scanner.nextLine();
        System.out.println("Introduzca el destino: ");
        destino = scanner.nextLine();
        System.out.println("Indique la fecha del viaje: yyyy-MM-dd");
        fecha = scanner.nextLine();
        System.out.println("Introduzca la cantidad de asientos que desea reservar: ");
        asientos = scanner.nextInt();

        //Creamos el Try and catch para si algun dato es incorrecto nos mande la excepcion.
        try{
            Reserva reserva = new Reserva(nombreYApellidos, destino, LocalDate.parse(fecha), asientos);
            System.out.println(reserva.toString());

            //Declaramos la excepcion personalizada.
        }catch (ReservaException e){
            System.out.println("Excepción: " + e.getMessage());

            //Declaramos la excepcion genérica
        }catch (Exception e){
            System.out.println("Excepción genérica: " + e.getMessage());
        }
    }
}