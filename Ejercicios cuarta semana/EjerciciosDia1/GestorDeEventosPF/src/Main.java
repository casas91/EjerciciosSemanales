import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Evento> eventoList = List.of(
                new Evento("Monologos", LocalDate.of(2023,11,26),"Comedia"),
                new Evento("Thysen", LocalDate.of(2023,11,25),"Museo"),
                new Evento("Boda", LocalDate.of(2023,11,30),"Festejos"),
                new Evento("Teatro Improvisado", LocalDate.of(2024,1,7),"Comedia"),
                new Evento("Prado", LocalDate.of(2023,11,26),"Museo"),
                new Evento("Futbol", LocalDate.of(2023,11,25),"Deporte"),
                new Evento("Extremoduro", LocalDate.of(2023,12,27),"Conciertos")
        );

        LocalDate fechaEspecifica = LocalDate.of(2023, 11, 26);
        List<Evento> eventosParaFechaEspecifica = eventoList.stream()
                .filter(evento -> evento.getFecha().equals(fechaEspecifica))
                .collect(Collectors.toList());

        System.out.println("Eventos programados para el " + fechaEspecifica + ":");
        eventosParaFechaEspecifica.forEach(evento ->
                System.out.println(evento.getNombre() + " - " + evento.getCategoria()));

        System.out.println("-----------------------------");


        Map<String, Long> conteoEventosPorCategoria = eventoList.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

        System.out.println("Conteo de eventos por categoría:");
        conteoEventosPorCategoria.forEach((categoria, cantidad) ->
                System.out.println(categoria + ": " + cantidad + " eventos"));

        System.out.println("----------------------------");


        Optional<Evento> eventoMasProximo = eventoList.stream()
                .min((e1, e2) -> e1.getFecha().compareTo(e2.getFecha()));

        eventoMasProximo.ifPresent(evento ->
                System.out.println("Evento más próximo: " + evento.getNombre() +
                        " - Fecha: " + evento.getFecha()));
    }
}