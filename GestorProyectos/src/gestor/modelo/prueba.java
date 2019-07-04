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
public class prueba {
    public static void main(String[] args) {
        EstadoCerrado e = new EstadoCerrado("Se cerro el estado 1");
        EstadoCerrado a = new EstadoCerrado("Se cerro el estado 2");
        
        System.out.println("Estado 1: " + e.getDescripcion());
        System.out.println("Estado 2: " + a.getDescripcion());
        
    }
    
}
