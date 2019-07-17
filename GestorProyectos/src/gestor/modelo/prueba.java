/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.modelo;

import gestor.controlador.ControladorProyecto;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Usuario
 */
public class prueba {
    public static void main(String[] args) {
//        
//        Integrante i = new Integrante();
//        i.setSuspensiones(Suspension.BAÑO);
//        
//        System.out.println("Integrante 1: " + i.getSuspensiones());
        Suspension sus = new Suspension();
        EstadoRegistro est = new EstadoRegistro("estado de registro");
        
        Integrante int1;
        int1 = new Integrante();
        Integrante int2 = new Integrante();
        List<Integrante> listaIngrantes = new ArrayList<>();
        listaIngrantes.add(int1);
        listaIngrantes.add(int2);
        
        ControladorProyecto.getInstance().crearProyecto(listaIngrantes, "Proyecto 1", "esta es una descripcion");
        
    }
    
}
