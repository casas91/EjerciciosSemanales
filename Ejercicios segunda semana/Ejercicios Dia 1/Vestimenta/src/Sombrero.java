public class Sombrero extends Vestimenta{

    private String tipo;
    private String size;

    public Sombrero(int codigo, String nombre, double precio, String marca, double talla, String color, String tipo, String tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.size = size;
    }

    @Override
    public void mostrarMarca() {
        super.mostrarMarca();
    }
}


