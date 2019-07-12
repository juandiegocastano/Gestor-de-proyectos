/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.modelo;

/**
 *
 * @author Usuario
 */
public class Integrante {
    
    private Tarea tareasAsignadas;
    private String nombreIntegrante;
    private Suspension suspensiones;
    
    public Integrante(){};
    public Tarea getTareasAsignadas() {
        return tareasAsignadas;
    }

    public void setTareasAsignadas(Tarea tareasAsignadas) {
        this.tareasAsignadas = tareasAsignadas;
    }

    public String getNombreIntegrante() {
        return nombreIntegrante;
    }

    public void setNombreIntegrante(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    public Suspension getSuspensiones() {
        return suspensiones;
    }

    public void setSuspensiones(Suspension suspensiones) {
        this.suspensiones = suspensiones;
    }

    
}
