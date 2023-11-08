import java.time.LocalDate;

public class Reserva {
    //Atributos
    private String nombreYApellidos;
    private String destino;
    private LocalDate fechaDeViaje;
    private int numeroAsientos;
    private int asientosTotales = 1000;

    //Constructores
    public Reserva(String nombreYApellidos, String destino, LocalDate fechaDeViaje, int numeroAsientos) throws ReservaException{
        if (nombreYApellidos.isEmpty() || nombreYApellidos == ""){
            throw new ReservaException("Introduzca el nombre");
        }else if(destino.isEmpty() || destino == ""){
            throw new ReservaException("Introduzca el destino");
        } else if (fechaDeViaje.isBefore(LocalDate.now())) {
            throw new ReservaException("Fecha futura, introduzca fecha valida");
        } else if(numeroAsientos == 0){
            throw new ReservaException("Indique asientos a reservar");
        }else {
            if (numeroAsientos > asientosTotales)
                throw new ReservaException("Has reservado mas asientos de los disponibles. Quedan: " + asientosTotales);
            else {
                this.nombreYApellidos = nombreYApellidos;
                this.destino = destino;
                this.fechaDeViaje = fechaDeViaje;
                this.numeroAsientos = numeroAsientos;
            }
        }
    }

    @Override
    public String toString() {
        return "Reserva Confirmada{" +
                "nombre='" + nombreYApellidos + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fechaDeViaje +
                ", numeroAsientos=" + numeroAsientos +
                '}';
    }
}