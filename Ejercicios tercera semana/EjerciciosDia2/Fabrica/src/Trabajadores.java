public class Trabajadores extends Thread{
    private int id;

        public Trabajadores(int id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        @Override
    public void run() {
            //Creamos el metodo para ensamblar el producto y la duracion
        ensamblarProduto();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Trabajador " + id + " ha terminado de ensamblar productos.");

        //Creamos el metodo para control de calidad del producto y la duracion
        controlCalidad();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Mandamos un sout para decir que el trabajo ha finalizado
        System.out.println("Trabajador " + id + " ha terminado el control de calidad.");

        //Creamos el metodo para ls empaquetacion del producto y la duracion
        empaquetarProduto();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Mandamos un sout para decir que el trabajo ha finalizado
        System.out.println("Trabajador " + id + " ha terminado de embalar productos.");

    }

    public void ensamblarProduto() {
        System.out.println("Trabajador " + this.getId() + " está ensamblando el producto");
    }

    public void controlCalidad(){
        System.out.println("Trabajador " + this.getId() + " está realizando el control de calidad");
    }

    public void empaquetarProduto(){
        System.out.println("Trabajador " + this.getId() + " está empaquetando el producto");
    }
}
