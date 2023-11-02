public class Main {
    public static void main(String[] args) {

        //Electrodomesticos con parametros.

        Electrodomestico electrodomestico1 = new Electrodomestico(1,"Teka","A21","4.8Kw/h","Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(2,"Bosch","R45","3.5Kw/h","Gris");
        Electrodomestico electrodomestico3 = new Electrodomestico(3,"LG","JF65","5.6Kw/h","Negro");

        //Electrodomestico sin parametros

        Electrodomestico electrodomestico4 = new Electrodomestico();

        System.out.println("Marca: " + electrodomestico1.getMarca() + " Modelo: " + electrodomestico1.getModelo() + " Consumo: " + electrodomestico1.getConsumo());
        System.out.println("Marca: " + electrodomestico2.getMarca() + " Modelo: " + electrodomestico2.getModelo() + " Consumo: " + electrodomestico2.getConsumo());
        System.out.println("Marca: " + electrodomestico3.getMarca() + " Modelo: " + electrodomestico3.getModelo() + " Consumo: " + electrodomestico3.getConsumo());

        System.out.println("Marca: " +electrodomestico4.getMarca());

        //Al intentar obtener el valor de la marca de electrodomestico4, obtenemos un valor null o vacio.




    }
}