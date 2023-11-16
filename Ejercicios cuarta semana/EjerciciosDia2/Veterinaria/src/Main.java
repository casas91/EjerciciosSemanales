import java.util.List;

public class Main {
    public static void main(String[] args) {

        RegistroMascotas registroMascotas = new RegistroMascotas();

        registroMascotas.agregarMascota(new Mascota(1, "Silvan", 10, "Perro"));
        registroMascotas.agregarMascota(new Mascota(2, "Coque", 12, "Gato"));
        registroMascotas.agregarMascota(new Mascota(3, "Pica", 9, "Pajaro"));
        registroMascotas.agregarMascota(new Mascota(4, "Dina", 4, "Serpiente"));
        registroMascotas.agregarMascota(new Mascota(5, "Momo", 4, "Perro"));
        registroMascotas.agregarMascota(new Mascota(6, "Soco", 6, "Serpiente"));

        //Buscar mascotas por nombre
        List<Mascota> mascotasPorNombre = registroMascotas.buscarPorNombre("Dina");
        System.out.println("Mascotas con nombre Dina: ");
        for (Mascota mascota : mascotasPorNombre) {
            System.out.println(mascota);
        }

        System.out.println("--------------");

        //Buscar mascotas por especie
        List<Mascota> perros = registroMascotas.buscarPorEspecie("Perro");
        System.out.println("Perros en el registro: ");
        for (Mascota mascota : perros) {
            System.out.println(mascota);
        }

        System.out.println("--------------");

        //Contar la cantidad total de mascotas registradas
        int totalMascotas = registroMascotas.contarTotalMascotas();
        System.out.println("Mascotas registradas: " + totalMascotas);

        System.out.println("--------------");

        //Generar mascotas aleatorias
        registroMascotas.generarDatosAleatorios(5);
        System.out.println("Después de generar datos aleatorios:");
        System.out.println("Total de mascotas registradas: " + registroMascotas.contarTotalMascotas());

        System.out.println("--------------");

        //Mostrar todas las mascotas con las nuevas generadas.
        List<Mascota> todasLasMascotas = registroMascotas.obtenerMascotas();
        System.out.println("Lista con las nuevas mascotas: ");
        for (Mascota mascota : todasLasMascotas) {
            System.out.println(mascota);
        }


    }
}


