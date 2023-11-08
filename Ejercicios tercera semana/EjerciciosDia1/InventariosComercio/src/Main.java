import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaramos las variables
        String nombre;
        double precio;
        int cantidad;

        //Declaramos la variable scanner
        Scanner scanner = new Scanner(System.in);


        //Solicitamos los datos a los usuarios
        System.out.println("Inventario del Comercio");

        System.out.println("Introduzca el nombre del producto: ");
        nombre = scanner.nextLine();
        System.out.println("Introduzca el precio del producto: ");
        precio = Double.parseDouble(scanner.next());
        System.out.println("Introduzca la cantidad: ");
        cantidad = scanner.nextInt();

        //Creamos el producto dentro del try and catch por si nos da una excepcion.
        try {
            Producto producto = new Producto(nombre, precio, cantidad);

        } catch (ProductoException e) {
            System.out.println("Excepción: "+e.getMessage());

        } catch (Exception e) {
            System.out.println("Excepción genérica: "+e.getMessage());
        }
    }
}
