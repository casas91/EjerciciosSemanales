
public class Main {
    public static void main(String[] args) {
        // Creamos el numero de agentes
        int numAgentes = (int) ((Math.random() * 4) + 2);
        //Creamos array con el numero de llamadas.
        Llamada[] llamadas = new Llamada[(int) ((Math.random() * 9) + 2)];

        //Creamos a los agentes
        Agente[] agentes = new Agente[numAgentes];

        //Creamos for para iniciarlos
        for (int i = 0; i < numAgentes; i++) {
            agentes[i] = new Agente(i);
            agentes[i].start();
        }

        //Simulamos las llamadas
        for (int i = 0; i < llamadas.length; i++) {
            llamadas[i] = new Llamada("" + (i + 1));
            agentes[i % numAgentes].atenderLlamada(llamadas[i]);
            //Simulamos el tiempo de la llamada
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}