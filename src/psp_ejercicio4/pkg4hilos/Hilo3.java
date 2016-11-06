package psp_ejercicio4.pkg4hilos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo3 extends Thread {

    private Semaphore semaphore;

    public Hilo3(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            Thread.sleep(1200);    
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo3.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Entra hilo 3");
        this.semaphore.release(2);
        System.out.println("Sale hilo 3");
    }
}
