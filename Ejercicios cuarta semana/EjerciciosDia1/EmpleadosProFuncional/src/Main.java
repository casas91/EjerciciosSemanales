import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Empleados> empleadosList = List.of(
                new Empleados("Carlos",25000,"Programador"),
                new Empleados("Ana",27000,"Desarrollador"),
                new Empleados("David",32000,"Programador"),
                new Empleados("Marta",60000,"Director"),
                new Empleados("Juan",45000,"Recursos Humanos"),
                new Empleados("Maria",30000,"Recursos Humanos")
        );

        List<Empleados> empleadosFiltrados = empleadosList.stream()
                .filter(e -> e.getSalario()>27000)
                .collect(Collectors.toList());

        empleadosFiltrados.forEach(System.out::println);

        System.out.println("------------------");


        List<Empleados> empleadosPorCategoria = empleadosList.stream()
                .sorted(Comparator.comparing(Empleados::getPosicion))
                .collect(Collectors.toList());

        empleadosPorCategoria.forEach(System.out::println);

        System.out.println("-------------------");

        Map<String, Double> salarioPromedioPorCategoria = empleadosPorCategoria.stream()
                .collect(Collectors.groupingBy(Empleados::getPosicion,
                        Collectors.averagingDouble(Empleados::getSalario)));

        salarioPromedioPorCategoria.forEach((categoria, salarioPromedio) ->
                System.out.println(categoria + ": " + salarioPromedio));


        System.out.println("-------------------");


        Optional<Empleados> empleadoSalarioMax = empleadosList.stream()
                .max(Comparator.comparingDouble(Empleados::getSalario));

        empleadoSalarioMax.ifPresent(empleado ->
                System.out.println("Empleado con el salario más alto: " + empleado.getNombre() +" - "+
                        empleado.getPosicion()+" - " + empleado.getSalario()));










    }
}