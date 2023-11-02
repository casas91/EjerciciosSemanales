public class Vestimenta {
    //Atributos

    private int codigo;
    private String nombre;
    private double precio;
    private String marca;
    private double talla;
    private String color;

    public Vestimenta(int codigo, String nombre, double precio, String marca, double talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public void mostrarMarca() {
        System.out.println("Esta vestimenta es de marca: " +marca);
    }
}
