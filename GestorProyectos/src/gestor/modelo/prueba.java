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

        Integrante i = new Integrante();
        i.setSuspensiones(Suspension.BAÑO);
        
        System.out.println("Integrante 1: " + i.getSuspensiones());
        
    }
    
}
