public class Zapato extends Vestimenta{

    private String material;
    private String tipoDeCierre;

    public Zapato(int codigo, String nombre, double precio, String marca, double talla, String color, String materia, String tipoDeCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = materia;
        this.tipoDeCierre = tipoDeCierre;
    }

    @Override
    public void mostrarMarca() {
        super.mostrarMarca();
    }
}


