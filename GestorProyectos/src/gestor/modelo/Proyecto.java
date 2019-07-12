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
public class Proyecto {
    
    private Tarea listaTareas;
    private Integrante listaIntegrantes;
    private String nombreProyecto;

    public Tarea getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(Tarea listaTareas) {
        this.listaTareas = listaTareas;
    }

    public Integrante getListaIntegrantes() {
        return listaIntegrantes;
    }

    public void setListaIntegrantes(Integrante listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    
}
