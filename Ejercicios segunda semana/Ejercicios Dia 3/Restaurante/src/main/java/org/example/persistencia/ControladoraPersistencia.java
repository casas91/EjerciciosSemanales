
package org.example.persistencia;

import org.example.logica.Platillos;

import java.util.List;

public class ControladoraPersistencia {

    PlatillosJpaController platilloJpa = new PlatillosJpaController();

    public void crearPersona(Platillos platillos){
        platilloJpa.create(platillos);
    }
    public void eliminarPersona(Long id){
        platilloJpa.destroy(id);
    }
    public void editarPersona(Platillos persona){
        platilloJpa.edit(persona);
    }
    public List<Platillos> listarPlatillos(){
        return platilloJpa.findPlatillosEntities();
    }
}


