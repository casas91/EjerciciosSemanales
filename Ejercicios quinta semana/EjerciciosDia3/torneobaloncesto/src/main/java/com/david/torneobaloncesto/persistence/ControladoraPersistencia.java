
package com.david.torneobaloncesto.persistence;

import com.david.torneobaloncesto.logica.Equipo;
import com.david.torneobaloncesto.logica.Partido;
import java.util.List;

/**
 *
 * @author David
 */
public class ControladoraPersistencia {
     EquipoJpaController controladorEquipo = new EquipoJpaController();
    PartidoJpaController controladorPartido = new PartidoJpaController();

    public void añadirEquipo(Equipo equipo) {

        controladorEquipo.create(equipo);

    }

    public void añadirPartido(Partido partido, Long idEquipo1, Long idEquipo2) {

        Equipo equipo1 = controladorEquipo.findEquipo(idEquipo1);
        Equipo equipo2 = controladorEquipo.findEquipo(idEquipo2);

        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        controladorPartido.create(partido);

    }

    public List<Equipo> mostrarEquipos() {
        List<Equipo> equipos = controladorEquipo.findEquipoEntities();

        return equipos;
    }

    public List<Partido> mostrarPartidos() {
        List<Partido> partidos = controladorPartido.findPartidoEntities();

        return partidos;
    }

}
    

