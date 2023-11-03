package org.example.persistencia;

import org.example.logica.Platillos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class PlatillosJpaController {

        private EntityManagerFactory emf = null;

        //Constructor

        public PlatillosJpaController() {
            //Obtener la unidad de persistencia creada
            this.emf = Persistence.createEntityManagerFactory("restaurantePU");
        }

        public EntityManager getEntityManager() {
            return emf.createEntityManager();
        }

        //Crear metodos para interactuar con la BD

        public void create(Platillos platillo) {
            EntityManager em = null;
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(platillo);
            em.getTransaction().commit();
        }

        public void destroy(Long id) {
            EntityManager em = null;
            em = getEntityManager();
            em.getTransaction().begin();
            Platillos persona = em.find(Platillos.class, id);
            em.remove(persona);
            em.getTransaction().commit();

        }

        public void edit(Platillos persona) {
            EntityManager em = null;
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        }

        public List<Platillos> findPlatillosEntities() {
            EntityManager em = null;
            em = getEntityManager();
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Platillos.class));
            Query q = em.createQuery(cq);
            return q.getResultList();
        }
    }
