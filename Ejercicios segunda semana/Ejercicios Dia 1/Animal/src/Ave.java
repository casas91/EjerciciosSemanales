public class Ave extends Animal{

    private double embergaduraAlas;
    private String tipoDeVuelo;
    private String colorPlumaje;
    private String tipoDePico;

    public Ave(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, double embergaduraAlas, String tipoDeVuelo, String colorPlumaje, String tipoDePico) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.embergaduraAlas = embergaduraAlas;
        this.tipoDeVuelo = tipoDeVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoDePico = tipoDePico;
    }

    @Override
    public String saludar() {
        return "Hola soy un ave";
    }
}
