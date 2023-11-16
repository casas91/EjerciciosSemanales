import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventarioAutos<T extends Auto> {

    private List<T> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    public void agregarAuto(T auto) {
        inventario.add(auto);
        System.out.println("Auto agregado al inventario: " + auto);
    }

    public List<T> buscarAutoMarca(String marca) {
        List<T> autosEncontrados = inventario.stream()
                .filter(autoBuscado -> autoBuscado.getMarca().equalsIgnoreCase(marca))
                .peek(System.out::println)
                .collect(Collectors.toList());

        if (autosEncontrados.isEmpty()) {
            System.out.println("No se encontraron autos con la marca: " + marca);
        }

        return autosEncontrados;
    }

    public List<T> buscarAutoAnyo(int anyo) {
        List<T> autosAnyo = inventario.stream()
                .filter(autoBuscado -> autoBuscado.getAnyo() == anyo)
                .peek(System.out::println)
                .collect(Collectors.toList());

        if (autosAnyo.isEmpty()) {
            System.out.println("No se encontraron autos del año: " + anyo);
        }

        return autosAnyo;
    }

    public double calcularTotal() {
        return inventario.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();
    }
}






