public class Main {
    public static void main(String[] args) {

        //Creamos vector vestimenta

        Vestimenta[] vestimentas = new Vestimenta[9];

        //Creamos objetos con sus parametros

        vestimentas[0] = new Zapato(1,"Sandalia",35.5,"Puma",39,"Azul","Caucho","Velcro");
        vestimentas[1] = new Zapato(2,"Bota",30,"Merrel",40,"marron","piel","Velcro");
        vestimentas[2] = new Zapato(3,"Deportiva",25,"Nike",36,"verde","sintetico","Velcro");
        vestimentas[3] = new Pantalon(4,"Corto",12,"Adidas",34,"negro","Corto","Algodon");
        vestimentas[4] = new Pantalon(5,"Vaquero",40,"Levis",42,"blanco","Vaquero","Seda");
        vestimentas[5] = new Pantalon(6,"Chandal",20,"Reebok",46,"amarillo","Largo","Poliester");
        vestimentas[6] = new Camiseta(7,"Corta",8,"Nike",30,"morado","Corta","normal");
        vestimentas[7] = new Camiseta(8,"Larga",15,"Puma",28,"rosa","Larga","en pico");
        vestimentas[8] = new Sombrero(9,"Copa",42.5,"Cortefield",41,"gris","Copa","Grande");


        //Recorremos el vector y ejecutamos los metodos.

        for (Vestimenta vestimenta: vestimentas) {
            vestimenta.mostrarMarca();


        }






    }
}