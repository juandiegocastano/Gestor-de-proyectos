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

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "Suspension")
public class Suspension implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "razonSuspension", nullable = false)
    private String razonSuspension;
    
    @ManyToOne
    private Integrante integrante;
    
    /*    CONSTRUCTORES--------------------------------------------->*/
    public Suspension() {
    }
    
    public Suspension(String razonSuspension, Integrante integrante) {
        this.razonSuspension = razonSuspension;
        this.integrante = integrante;
    }
    
    public Integrante getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }
    
    public String getRazonSuspension() {
        return razonSuspension;
    }
    
    public void setRazonSuspension(String razonSuspension) {
        this.razonSuspension = razonSuspension;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}

