public class Reptil extends Animal{

    private double longitud;
    private String tipoDeEscamas;
    private String tipoDeVeneno;
    private String habitat;

    public Reptil(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, double longitud, String tipoDeEscamas, String tipoDeVeneno, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.longitud = longitud;
        this.tipoDeEscamas = tipoDeEscamas;
        this.tipoDeVeneno = tipoDeVeneno;
        this.habitat = habitat;
    }

    @Override
    public String saludar() {
        return "Hola soy un reptil";
    }
}
