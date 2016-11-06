package psp_ejercicio5.bancos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Miguel
 */
public class CuentaBancaria {
    private int money = 1000;
    private boolean isMoney = false;
    
    public synchronized int get(int value) {
        while (!isMoney) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        if (!(value > money)){
            money -= value;
        }

        isMoney = false;
        
        System.out.println("Consumer. get: " + money);
                
        // Notifies that the value has been extracted
        notifyAll();
        return money;
    }
    
    public synchronized void put(int value) {
       while (isMoney) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
            
        money += value;
        isMoney = true;
        System.out.println("Producer. put: " + money);
        notifyAll();
    }
}
