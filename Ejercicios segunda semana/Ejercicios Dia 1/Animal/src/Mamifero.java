public class Mamifero extends Animal{

    private int numDePatas;
    private String tipoDeReproduccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, int numDePatas, String tipoDeReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.numDePatas = numDePatas;
        this.tipoDeReproduccion = tipoDeReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    @Override
    public String saludar() {
        return "Hola soy un mamifero";
    }
}
