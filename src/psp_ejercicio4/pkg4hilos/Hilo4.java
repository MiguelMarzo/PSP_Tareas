package psp_ejercicio4.pkg4hilos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo4 extends Thread {

    private Semaphore semaphore1;
    private Semaphore semaphore2;

    public Hilo4(Semaphore semaphore, Semaphore semaphore2) {
        this.semaphore1 = semaphore;
        this.semaphore2 = semaphore2;
    }

    public void run() {
        try {
            semaphore1.acquire();
            semaphore2.acquire();
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo4.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Entra Hilo 4");
        this.semaphore1.release();
        this.semaphore2.release();
        System.out.println("Sale Hilo 4");
               
        
    }
}
