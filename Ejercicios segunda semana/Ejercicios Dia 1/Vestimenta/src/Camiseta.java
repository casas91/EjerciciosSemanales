public class Camiseta extends Vestimenta{

    private String manga;
    private String cuello;

    public Camiseta(int codigo, String nombre, double precio, String marca, double talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    @Override
    public void mostrarMarca() {
        super.mostrarMarca();
    }
}


