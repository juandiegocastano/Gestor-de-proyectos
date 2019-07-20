/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.joda.time.DateTime;
import org.joda.time.Duration;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "EstadoRegistro")
public class EstadoRegistro implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    
    @Column(name = "duracion", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Duration duracion;
    
    @Column(name = "fechaInicio", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private DateTime fechaInicio;
    
    @Column(name = "estadoActual", nullable = false)
    private String estadoActual;
    
    @ManyToOne
    private Tarea tareaRealizada;
    
    @ManyToOne
    private Integrante integrante;

    //Constructor para un nuevo estadoRegistro
    public EstadoRegistro(Tarea tareaRealizada, Integrante integrante) {
        this.duracion = Duration.ZERO;
        this.fechaInicio = DateTime.now();
        this.tareaRealizada = tareaRealizada;
        this.integrante = integrante;
    }

    /*    CONSTRUCTORES--------------------------------------------->*/
    public EstadoRegistro() {
    }
 
    public EstadoRegistro(String descripcion) {
        System.out.println("Construyendo un Estado");
        this.descripcion = descripcion;
    }
    
    public Tarea getTareaRealizada() {
        return tareaRealizada;
    }

    public void setTareaRealizada(Tarea tareaRealizada) {
        this.tareaRealizada = tareaRealizada;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }
    
    public void setDescripcion(String pDescripcion) {
        this.descripcion = pDescripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public DateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(DateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
        public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }
    
    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }
    
}
