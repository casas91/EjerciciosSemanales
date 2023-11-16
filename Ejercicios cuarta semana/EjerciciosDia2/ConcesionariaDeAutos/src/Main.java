public class Main {
    public static void main(String[] args) {

        InventarioAutos<Auto> inventarioAutos = new InventarioAutos<>();

        inventarioAutos.agregarAuto(new Auto("Toyota","Yaris",2022,20000.0));
        inventarioAutos.agregarAuto(new Auto("Peugeot","207",2012,6000.0));
        inventarioAutos.agregarAuto(new Auto("Mercedes","Benz",2018,15000.0));
        inventarioAutos.agregarAuto(new Auto("Seat","Toledo",2021,18000.0));
        inventarioAutos.agregarAuto(new Auto("Renault","Megane",2023,25000.0));

        System.out.println("-------------------");

        inventarioAutos.buscarAutoMarca("Toyota");

        System.out.println("--------------------");

        inventarioAutos.buscarAutoAnyo(2021);

        System.out.println("--------------------");

        double totalAutos = inventarioAutos.calcularTotal();
        System.out.println("El precio de todo el inventario es de: "+totalAutos);




    }
}