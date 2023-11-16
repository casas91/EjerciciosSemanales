import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear la estructura de directorios
        Directorio directorioPrincipal = new Directorio("Directorio Principal");

        Directorio directorio1 = new Directorio("Directorio1");
        Directorio directorio2 = new Directorio("Directorio2");

        directorioPrincipal.agregarSubdirectorio(directorio1);
        directorioPrincipal.agregarSubdirectorio(directorio2);

        Directorio subDirectorio1 = new Directorio("SubDirectorio1");
        Directorio subDirectorio1_1 = new Directorio("SubDirectorio1.1");
        Directorio subDirectorio1_2 = new Directorio("SubDirectorio1.2");

        subDirectorio1.agregarSubdirectorio(subDirectorio1_1);
        subDirectorio1.agregarSubdirectorio(subDirectorio1_2);

        subDirectorio1_1.agregarArchivo("Archivo4.txt");
        subDirectorio1_2.agregarArchivo("Archivo5.txt");

        directorio1.agregarSubdirectorio(subDirectorio1);
        directorio1.agregarArchivo("Archivo1.txt");
        directorio1.agregarArchivo("Archivo2.txt");
        subDirectorio1.agregarArchivo("Archivo3.txt");

        Directorio subdirectorio2 = new Directorio("Subdirectorio2");
        Directorio subDirectorio2_1 = new Directorio("SubDirectorio2.1");
        Directorio subDirectorio2_2 = new Directorio("SubDirectorio2.2");

        directorio2.agregarSubdirectorio(subdirectorio2);
        subdirectorio2.agregarSubdirectorio(subDirectorio2_1);
        subdirectorio2.agregarSubdirectorio(subDirectorio2_2);

        subdirectorio2.agregarArchivo("Archivo6.txt");

        subDirectorio2_1.agregarArchivo("Archivo7.txt");
        subDirectorio2_2.agregarArchivo("Archivo8.txt");

        //Explorar el directorio principal de manera recursiva
        ExploradorDirectorios.explorarDirectorio(directorioPrincipal);
    }
}