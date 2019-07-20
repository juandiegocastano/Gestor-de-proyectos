/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.joda.time.DateTime;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "Tarea")
public class Tarea implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "fechaInicio", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private DateTime fechaInicio;
    
    @OneToMany
    private List<EstadoRegistro> estados;
    
    @ManyToOne
    private Proyecto proyecto;
    
    /*    CONSTRUCTORES--------------------------------------------->*/
    
    public Tarea() {
    }
    public Tarea(DateTime fechaInicio, List<EstadoRegistro> estados, Proyecto proyecto) {
        this.proyecto = proyecto;
        this.fechaInicio = fechaInicio;
        this.estados = estados;
    }

    public Tarea(DateTime tiempo, List<EstadoRegistro> estados) {
        this.fechaInicio = tiempo;
        this.estados = estados;
    }
    
    public DateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(DateTime tiempo) {
        this.fechaInicio = tiempo;
    }

    public List<EstadoRegistro> getEstado() {
        return estados;
    }

    public void setEstado(List<EstadoRegistro> estado) {
        this.estados = estado;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<EstadoRegistro> getEstados() {
        return estados;
    }

    public void setEstados(List<EstadoRegistro> estados) {
        this.estados = estados;
    }
    

    
    
  
    
}
