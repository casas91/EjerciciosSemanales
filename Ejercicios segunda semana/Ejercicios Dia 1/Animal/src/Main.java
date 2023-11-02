public class Main {
    public static void main(String[] args) {

        //Creamos los diferentes tipos de animal y llamamos al metodo saludar.

        Mamifero mamifero1 = new Mamifero(01,"Lobo",8,"Pelo","Pequeños mamíferos",4,"viviparo","gris","Montañas");

        System.out.println(mamifero1.saludar());

        Ave ave1 = new Ave(02,"Gorrión",2,"Pluma","Semillas",15,"rapido","marron","granivoro");

        System.out.println(ave1.saludar());

        Reptil reptil1 = new Reptil(03,"Serpiente",3,"Escamas","Roedores",100,"lisa","neurotoxico","Selva");

        System.out.println(reptil1.saludar());

        //Creamos objeto de tipo animal e intentamos asignarle al mamifero creado.

        //Animal mamifero1 = new Mamifero(04,"Leon",9,"Pelo","Carnivoro",4,"Viviparo","marrón","Sabana");

        //No se puede asignar al mamífero creado ya que mamifero1 ya ha sido creado desde la clase Mamifero.

        //e) Al poner private no nos deja acceder a los métodos desde fuera de las subclases.







    }
}