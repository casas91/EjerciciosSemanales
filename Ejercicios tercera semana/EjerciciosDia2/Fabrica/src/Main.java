public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numTrajadores = (int) ((Math.random() * 4) + 2);

        for (int i = 1; i <= numTrajadores; i++) {
            Trabajadores trabajador = new Trabajadores(i);
            Thread thread = new Thread(trabajador);
            Thread.sleep(1000);
            thread.start();
        }
    }
}
