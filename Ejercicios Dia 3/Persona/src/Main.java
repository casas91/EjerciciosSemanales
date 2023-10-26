public class Main {
    public static void main(String[] args) {

        //Creacion del vector persona.

        Persona vectorpersona[] = new Persona[5];

        //Creacion de personas.

        vectorpersona[0] = new Persona(1, "David", 25, "Calle 3", "656453");
        vectorpersona[1] = new Persona(2, "Jose", 28, "Calle 5", "654832");
        vectorpersona[2] = new Persona(3, "Maria", 18, "Calle 4", "548564");
        vectorpersona[3] = new Persona(4, "Marta", 52, "Calle 7", "452375");
        vectorpersona[4] = new Persona(5, "Judith", 35, "Calle 1", "545247");

        //Recorremos el vector

        for (int i = 0; i < vectorpersona.length; i++) {

            //Mostramos nombre y edad por pantalla
            //System.out.println("Nombre: " + vectorpersona[i].getNombre() + "  Edad: " + vectorpersona[i].getEdad());

            //Mostrar por pantalla a las personas mayores de 30 años
            if (vectorpersona[i].getEdad() > 30) {

                System.out.println("ID: " + vectorpersona[i].getId() + "  Nombre: " + vectorpersona[i].getNombre() + "  Edad: " + vectorpersona[i].getEdad() + " Direccion: " + vectorpersona[i].getDireccion() +" Numero de telefono: "+vectorpersona[i].getNumTelefono());
            }
            }


        }
    }