/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simupato;

/**
 *
 * @author sistemas
 */

public class PatoAdaptadorDemo {
    
    public static void main(String[] args) {
        
        Drone miSuperDrone = new SuperDrone();
        
        
        Pato adaptadorDrone = new AdaptadorDrone(miSuperDrone);

        System.out.println("El adaptador drone hace...");
        
        testPato(adaptadorDrone);
    }

   
    static void testPato(Pato pato) {
        pato.cuaquear();
        pato.volar();
    }
}