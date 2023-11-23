
package com.david.torneobaloncesto.logica;

import com.david.torneobaloncesto.persistence.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author David
 */
public class Controladora {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void añadirEquipo(Equipo equipo) {
        controladoraPersistencia.añadirEquipo(equipo);
    }

    public List<Equipo> mostrarEquipos() {

        return controladoraPersistencia.mostrarEquipos();

    }

    public List<Partido> mostrarPartidos() {

        return controladoraPersistencia.mostrarPartidos();

    }

    public void añadirPartido(Partido partido, Long puntos1, Long puntos2) {
        controladoraPersistencia.añadirPartido(partido, puntos1, puntos2);
    }
    
}
