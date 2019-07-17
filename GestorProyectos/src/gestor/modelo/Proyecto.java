/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.modelo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */

@Entity
@Table(name = "Proyecto")
public class Proyecto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    
    @Column(name = "nombreProyecto", nullable = false)
    private String nombreProyecto;
    
    @Column(name = "descripcionProyecto", nullable = false)
    private String descripcionProyecto;
    
    @OneToMany
    private List<Tarea> listaTareas;
    
    @ManyToMany
    private List<Integrante> listaIntegrantes;

    /*    CONSTRUCTORES--------------------------------------------->*/
    public Proyecto() {
    }

    public Proyecto(List<Tarea> listaTareas, List<Integrante> listaIntegrantes, String nombreProyecto, String descripcionProyecto) {
        this.listaTareas = listaTareas;
        this.listaIntegrantes = listaIntegrantes;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
    }

    public Proyecto(List<Integrante> listaIntegrantes, String nombreProyecto, String descripcionProyecto) {
        this.listaIntegrantes = listaIntegrantes;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcionProyecto() {
        return this.descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }
    

 
    public List<Tarea> getListaTareas() {
        return this.listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }
    
    public Tarea getTareas(int index) {
        return this.listaTareas.get(index);
    }

    public void addTarea(Tarea tareaPorAgregar) {
        this.listaTareas.add(tareaPorAgregar);
    }
    
    public List<Integrante> getListaIntegrantes() {
        return this.listaIntegrantes;
    }

    public void setListaIntegrantes(List<Integrante> listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }
    
    public Integrante getIntegrante(int index) {
        return this.listaIntegrantes.get(index);
    }
    
    public void addIntegrante(Integrante integranteNuevo) {
        this.listaIntegrantes.add(integranteNuevo);
    }

    public String getNombreProyecto() {
        return this.nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }
    
    @Override
    public String toString() {
        return "Proyecto{" + "id=" + id 
                + ", nombreProyecto=" + nombreProyecto
                + ", descripcionProyecto=" + descripcionProyecto 
                + ", listaIntegrantes=" + listaIntegrantes 
                + ", listaTareas=" + listaTareas + '}';
    }

    
}
