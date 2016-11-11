
package psp_ejercicio5.bancos;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import psp_ejercicio4.pkg4hilos.Hilo1;
/**
 * @author Miguel
 */
public class BankAccount {
    int balance;
    Semaphore bankAccountSemaphore;
    
    
    public BankAccount(Semaphore semaphore) {
        this.bankAccountSemaphore = semaphore;
        this.balance = 100;        
    }
    
    
    public synchronized void deposit(int amount) {
        
    }
    
    public synchronized boolean takeOut(int amount) {
        boolean done = true;
        try {
            this.bankAccountSemaphore.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(BankAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
        } else {
            done = false;
            this.bankAccountSemaphore.release();
        }
        this.bankAccountSemaphore.release();
        return done;
    }
}
