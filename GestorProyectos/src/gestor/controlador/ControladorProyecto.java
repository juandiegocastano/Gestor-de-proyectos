/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.controlador;

import gestor.modelo.Proyecto;
import java.util.List;

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

    private List<Proyecto> listaProyectos;
    
    //TODO: Terminar metodos de controlador
    public void cambiarEstadoTarea(){};
    public void iniciarTarea(){};
    public void pararTarea(){};
    public void getProyecto(){};
    public void addProyecto(){};

}
