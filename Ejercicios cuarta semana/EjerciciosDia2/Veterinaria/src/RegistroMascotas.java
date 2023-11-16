import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RegistroMascotas {

    private List<Mascota> registro;

    public RegistroMascotas() {
        this.registro = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        registro.add(mascota);
    }

    public List<Mascota> buscarPorNombre(String nombre) {
        return registro.stream()
                .filter(m -> m.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    public List<Mascota> buscarPorEspecie(String especie) {
        return registro.stream()
                .filter(m -> m.getEspecie().equalsIgnoreCase(especie))
                .collect(Collectors.toList());
    }

    public int contarTotalMascotas() {
        return registro.size();
    }

    public void generarDatosAleatorios(int cantidad) {
        Random random = new Random();
        String[] nombres = {"Duna", "Luna", "Roco", "Firulais", "Donald", "Rocky", "Ibi", "Coco", "Milo", "Stella"};
        String[] especies = {"Perro", "Gato", "Serpiente", "Pajaro"};

        List<Mascota> mascotasGeneradas = random.ints(cantidad, 0, nombres.length)
                .mapToObj(i -> new Mascota(
                        i + 1,
                        nombres[i],
                        random.nextInt(15) + 1,
                        especies[random.nextInt(especies.length)]))
                .toList();

        mascotasGeneradas.forEach(this::agregarMascota);
    }

        public List<Mascota> obtenerMascotas() {
            return new ArrayList<>(registro);
        }
    }

