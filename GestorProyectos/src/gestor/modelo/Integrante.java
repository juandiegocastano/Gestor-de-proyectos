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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "Integrantes")
public class Integrante implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nombreIntegrante", nullable = true)
    private String nombreIntegrante;
    
    @OneToMany
    private List<Suspension> suspensiones;
    
    @OneToMany
    private List<EstadoRegistro> estadoRegistro;
 
    /*    CONSTRUCTORES--------------------------------------------->*/
    
    public Integrante(){};
    
    public Integrante(String nombreIntegrante, List<Suspension> suspensiones, List<EstadoRegistro> estadoRegistro) {
        this.nombreIntegrante = nombreIntegrante;
        this.suspensiones = suspensiones;
        this.estadoRegistro = estadoRegistro;
    }


    
    public List<EstadoRegistro> getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(List<EstadoRegistro> estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }
    
    public String getNombreIntegrante() {
        return nombreIntegrante;
    }

    public void setNombreIntegrante(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    public List<Suspension> getSuspensiones() {
        return suspensiones;
    }

    public void setSuspensiones(List<Suspension> suspensiones) {
        this.suspensiones = suspensiones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
