
public class Agente extends Thread {

    private int numeroAgentes;

    public Agente(int numeroAgentes) {
        this.numeroAgentes = numeroAgentes;
    }

    @Override
    public String toString() {
        return "Agente{" +
                "numAgente=" + numeroAgentes +
                '}';
    }

    public synchronized void atenderLlamada(Llamada llamada) {

        System.out.println("El agente " + (numeroAgentes + 1) + " atiende la llamada " + llamada.getNombre());
        //Duracion de la llamada
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //Finalizacion de la llamada
        System.out.println("El agente " + (numeroAgentes + 1) + " termina la llamada " + llamada.getNombre());
    }
}