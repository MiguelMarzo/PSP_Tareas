package psp_ejercicio4.pkg4hilos;

import java.util.concurrent.Semaphore;
/**
 * @author Miguel
 */
public class EjemploSemaforos {

    public static void main(String[] args) {
        Semaphore finHiloPrioritario1 = new Semaphore(0);
        Semaphore finHiloPrioritario3 = new Semaphore(0);
        Hilo1 hilo1 = new Hilo1(finHiloPrioritario1);
        Hilo2 hilo2 = new Hilo2(finHiloPrioritario1,finHiloPrioritario3);
        Hilo3 hilo3 = new Hilo3(finHiloPrioritario3);
        Hilo4 hilo4 = new Hilo4(finHiloPrioritario1, finHiloPrioritario3);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        
    }
    
}
