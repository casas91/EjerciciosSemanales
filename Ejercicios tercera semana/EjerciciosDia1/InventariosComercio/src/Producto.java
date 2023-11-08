import java.util.Scanner;

public class Producto {

    //Declaramos los atributos
    private String nombre;
    private Double precio;
    private int cantidad;

    //Declaramos el constructor


    public Producto(String nombre, Double precio, int cantidadDisponible) throws ProductoException {
        if(nombre.isEmpty() || nombre == ""){
            throw new ProductoException("Introduzca el nombre");
        }else if (precio <= 0){
            throw new ProductoException("Introduzca un precio mayor de 0");
        }else if (cantidadDisponible<0){
            throw new ProductoException("Introduzca una cantidad mayor a 0");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidad +
                '}';
    }
}
