public class Auto {

    private String marca;
    private String modelo;
    private int anyo;
    private Double precio;

    public Auto(String marca, String modelo, int anyo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyo=" + anyo +
                ", precio=" + precio +
                '}';
    }
}
