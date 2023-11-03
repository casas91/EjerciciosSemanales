package org.example;

import org.example.logica.Platillos;
import org.example.persistencia.ControladoraPersistencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ControladoraPersistencia controladora = new ControladoraPersistencia();
        //Creo un objeto de la clase persona

        Platillos platillo1 = new Platillos(1L,"patatas foster","patatas y bacon",7.5);


        //Persisto el objeto creado mediante JPA

        controladora.crearPersona(platillo1);

        //Creamos otros dos platos
        Platillos platillo2 = new Platillos(2L,"pollo al curry","pollo y curry",12.5);
        Platillos platillo3 = new Platillos(3L,"paella","arroz y cosas",15);

        controladora.crearPersona(platillo2);
        controladora.crearPersona(platillo3);

        //Elimino(BAJA) un registro creado y persistido anteriormente

        controladora.eliminarPersona(1L);

        //Editar (modificacion)
        platillo3.setNombre("Arroz caldoso");

        //Se obtienen(Listado) las personas persistidas
        List<Platillos> listPlatillos = controladora.listarPlatillos();

        for (Platillos platillos: listPlatillos) {
            System.out.println(" Nombre: "+platillos.getNombre() + " Receta: " +platillos.getReceta() + " Precio: " + platillos.getPrecio());

        }

    }
}