/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simupato;

/**
 *
 * @author sistemas
 */
public class AdaptadorDrone implements Pato {
    private Drone drone;

    public AdaptadorDrone(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void cuaquear() {
        drone.beep();
    }

    @Override
    public void volar() {
        drone.despegar();
        drone.girarRotor();
    }
}
