public class Empleados {
    private String nombre;
    private int salario;
    private String posicion;

    public Empleados(String nombre, int salario, String posicion) {
        this.nombre = nombre;
        this.salario = salario;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
