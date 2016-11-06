package psp_ejercicio3.parking;

import java.util.concurrent.Semaphore;

public class Parking {

    public static void main(String[] args) {
        
        Semaphore semaforo = new Semaphore(2);
        
        Coche coche1 = new Coche(semaforo, 10000, "SEAT Ibiza");
        Coche coche2 = new Coche(semaforo, 5000, "Ford Fiesta");
        Coche coche3 = new Coche(semaforo, 6000, "Renault Clio");
        
        coche1.start();
        coche2.start();
        coche3.start();
    }
}
