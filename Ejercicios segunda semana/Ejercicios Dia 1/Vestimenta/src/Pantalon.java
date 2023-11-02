public class Pantalon extends Vestimenta{

    private String estilo;
    private String tipoDeTejido;

    public Pantalon(int codigo, String nombre, double precio, String marca, double talla, String color, String estilo, String tipoDeTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoDeTejido = tipoDeTejido;
    }

    @Override
    public void mostrarMarca() {
        super.mostrarMarca();
    }
}


