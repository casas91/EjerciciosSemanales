import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaramos el vector
        String[] gestorDatos = new String[3];

        //Declaramos al Scanner
        Scanner scanner = new Scanner(System.in);

        //Creamos un for para recorrer el vector y que el usuario ingrese los datos

        int i;
        for (i = 0; i < gestorDatos.length; i++) {
            System.out.println("Introduce los datos: ");
            gestorDatos[i] = scanner.nextLine();
        }
        System.out.println("Introduce la posicion del dato que quieres ver:");
        int indice = scanner.nextInt();
        try {
            System.out.println(gestorDatos[indice]);
        }catch (Exception e){
            System.out.println("La posición introducida no existe");
        }

    }
}