/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.controlador;

import gestor.modelo.EstadoRegistro;
import gestor.modelo.Integrante;
import gestor.modelo.Proyecto;
import gestor.modelo.Suspension;
import gestor.modelo.Tarea;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.joda.time.DateTime;

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
      
   
   //--------------------------METODOS PARA PROYECTO----------------
    public Proyecto crearProyecto(List<Integrante> integrantesIniciales, String nombreProyecto, String descripcionProyecto) {
        Proyecto resp = new Proyecto(integrantesIniciales, nombreProyecto, descripcionProyecto);

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        //em.persist(resp);
        resp = em.merge(resp);

        em.getTransaction().commit();
        em.close();
        System.out.println("Proyecto guardado!");

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
    
    
    //-------------------------METODOS PARA TAREA----------------------------
    public Tarea crearTarea( List<EstadoRegistro> estados, Proyecto proyecto) {
        Tarea resp = new Tarea(DateTime.now(), estados, proyecto );

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        //em.persist(resp);
        resp = em.merge(resp);

        em.getTransaction().commit();
        em.close();
        System.out.println("Tarea guardada!");

        return resp;
    }
    
    public List<Tarea> listarTareas() {
        List<Tarea> resp = null;

        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT p FROM Tarea p");
        resp = (List<Tarea>) q.getResultList();

        em.close();

        return resp;
    }
    
    public void eliminarTarea(Long id){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        Tarea p = em.find(Tarea.class, id);
        if(p != null){
            em.remove(p);
        }

        em.getTransaction().commit();
        em.close();
    }

    public Tarea consultarTarea(Long id) {
        Tarea resp = null;

        EntityManager em = getEntityManager();
        resp = em.find(Tarea.class, id);
        
        em.close();

        return resp;
    }
    
    public void cambiarEstadoTarea(){};
    public void iniciarTarea(){};
    public void pararTarea(){};
    public void getProyecto(){};
    public void addProyecto(){};
    
    //-------------------------METODOS PARA ESTADOREGISTRO----------------------------
    
        public EstadoRegistro crearEstadoRegistro( Tarea tareaRealizada, Integrante integrante) {
        EstadoRegistro resp = new EstadoRegistro(tareaRealizada, integrante );

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        //em.persist(resp);
        resp = em.merge(resp);

        em.getTransaction().commit();
        em.close();
        System.out.println("Estado registro guardado!");

        return resp;
    }
    
    public List<EstadoRegistro> listarEstadoRegistros() {
        List<EstadoRegistro> resp = null;

        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT p FROM EstadoRegistro p");
        resp = (List<EstadoRegistro>) q.getResultList();

        em.close();

        return resp;
    }
    
    public void eliminarEstadoRegistro(Long id){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        EstadoRegistro p = em.find(EstadoRegistro.class, id);
        if(p != null){
            em.remove(p);
        }

        em.getTransaction().commit();
        em.close();
    }

    public EstadoRegistro consultarEstadoRegistro(Long id) {
        EstadoRegistro resp = null;

        EntityManager em = getEntityManager();
        resp = em.find(EstadoRegistro.class, id);
        
        em.close();

        return resp;
    }
    

//-------------------------METODOS PARA SUSPENSION--------------------------------
    
    public Suspension crearSuspension( String razonSuspension, Integrante integrante) {
        Suspension resp = new Suspension(razonSuspension, integrante );

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        //em.persist(resp);
        resp = em.merge(resp);

        em.getTransaction().commit();
        em.close();
        System.out.println("Suspension guardado!");

        return resp;
    }
    
    public List<Suspension> listarSuspensiones() {
        List<Suspension> resp = null;

        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT p FROM Suspension p");
        resp = (List<Suspension>) q.getResultList();

        em.close();

        return resp;
    }
    
    public void eliminarSuspension(Long id){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        Suspension p = em.find(Suspension.class, id);
        if(p != null){
            em.remove(p);
        }

        em.getTransaction().commit();
        em.close();
    }

    public Suspension consultarSuspension(Long id) {
        Suspension resp = null;

        EntityManager em = getEntityManager();
        resp = em.find(Suspension.class, id);
        
        em.close();

        return resp;
    }
    
    //---------------------------METODOS PARA INTEGRANTE--------------------------
        public Integrante crearIntegrante( String nombreIntegrante) {
        Integrante resp = new Integrante(nombreIntegrante );

        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        //em.persist(resp);
        resp = em.merge(resp);

        em.getTransaction().commit();
        em.close();
        System.out.println("Integrante guardado!");

        return resp;
    }
    
    public List<Integrante> listarIntegrantes() {
        List<Integrante> resp = null;

        EntityManager em = getEntityManager();
        Query q = em.createQuery("SELECT p FROM Integrante p");
        resp = (List<Integrante>) q.getResultList();

        em.close();

        return resp;
    }
    
    public void eliminarIntegrante(Long id){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        Integrante p = em.find(Integrante.class, id);
        if(p != null){
            em.remove(p);
        }

        em.getTransaction().commit();
        em.close();
    }

    public Integrante consultarIntegrante(Long id) {
        Integrante resp = null;

        EntityManager em = getEntityManager();
        resp = em.find(Integrante.class, id);
        
        em.close();

        return resp;
    }
}
