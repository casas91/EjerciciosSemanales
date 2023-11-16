public class ExploradorDirectorios {
    public static void explorarDirectorio(Directorio directorio) {
        System.out.println(directorio.getNombre());
        for (String archivo : directorio.archivos) {
            System.out.println("  - " + archivo);
        }
        for (Directorio subdirectorio : directorio.subdirectorios) {
            explorarDirectorio(subdirectorio);
        }
    }
}