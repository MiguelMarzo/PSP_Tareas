/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio3.parking;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Coche extends Thread {

    private Semaphore semaphore;
    private int sleepTime;
    private String model;

    public Coche(Semaphore semaphore, int sleep, String model) {
        this.semaphore = semaphore;
        this.sleepTime = sleep;
        this.model = model;
    }

    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Imprimiendo ticket de entrada para el coche " + this.model);
            System.out.println("El coche " + this.model + " entra en el parking.");
            Thread.sleep(this.sleepTime);
            semaphore.release();
            System.out.println("El coche " + this.model + " sale del parking.");
        } catch (InterruptedException ex) {
            Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
