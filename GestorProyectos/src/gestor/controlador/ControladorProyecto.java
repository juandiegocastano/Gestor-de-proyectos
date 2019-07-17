/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.controlador;

import gestor.modelo.Integrante;
import gestor.modelo.Proyecto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public class ControladorProyecto {
    
    private static ControladorProyecto instance;
    
    private ControladorProyecto() {}
    
    public static ControladorProyecto getInstance() {
        if (instance == null) {
            instance = new ControladorProyecto();
        }
        return instance;
    }

   private EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestorPU");
        return emf.createEntityManager();
    }
      
    public Proyecto crearProyecto(List<Integrante> integrantesIniciales, String nombreProyecto, String descripcionProyecto) {
        Proyecto resp = new Proyecto(integrantesIniciales, nombreProyecto, descripcionProyecto);

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        //em.persist(resp);
        resp = em.merge(resp);

        em.getTransaction().commit();
        em.close();
        System.out.println("Guardado!");

        return resp;
    }
    
    public List<Proyecto> listarProyectos() {
        List<Proyecto> resp = null;

        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT p FROM Proyecto p");
        resp = (List<Proyecto>) q.getResultList();

        em.close();

        return resp;
    }
    
    public void eliminarProyecto(Long id){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        Proyecto p = em.find(Proyecto.class, id);
        if(p != null){
            em.remove(p);
        }

        em.getTransaction().commit();
        em.close();
    }

    public Proyecto consultarProyecto(Long id) {
        Proyecto resp = null;

        EntityManager em = getEntityManager();
        resp = em.find(Proyecto.class, id);
        
        em.close();

        return resp;
    }
    
    //------------------TAREA-------------
    
//    public Tarea crearTarea(List<Integrante> integrantesIniciales, String nombreProyecto, String descripcionProyecto) {
//        Proyecto resp = new Proyecto(integrantesIniciales, nombreProyecto, descripcionProyecto);
//
//        EntityManager em = getEntityManager();
//        em.getTransaction().begin();
//        //em.persist(resp);
//        resp = em.merge(resp);
//
//        em.getTransaction().commit();
//        em.close();
//        System.out.println("Guardado!");
//
//        return resp;
//    }
//    
//    public List<Proyecto> listarProyectos() {
//        List<Proyecto> resp = null;
//
//        EntityManager em = getEntityManager();
//        Query q = em.createQuery("SELECT p FROM Proyecto p");
//        resp = (List<Proyecto>) q.getResultList();
//
//        em.close();
//
//        return resp;
//    }
//    
//    public void eliminarProyecto(Long id){
//        EntityManager em = getEntityManager();
//        em.getTransaction().begin();
//        
//        Proyecto p = em.find(Proyecto.class, id);
//        if(p != null){
//            em.remove(p);
//        }
//
//        em.getTransaction().commit();
//        em.close();
//    }
//
//    public Proyecto consultarProyecto(Long id) {
//        Proyecto resp = null;
//
//        EntityManager em = getEntityManager();
//        resp = em.find(Proyecto.class, id);
//        
//        em.close();
//
//        return resp;
//    }
    
    
    
    //TODO: Terminar metodos de controlador
    public void cambiarEstadoTarea(){};
    public void iniciarTarea(){};
    public void pararTarea(){};
    public void getProyecto(){};
    public void addProyecto(){};

}
