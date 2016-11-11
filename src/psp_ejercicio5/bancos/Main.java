
package psp_ejercicio5.bancos;

import java.util.concurrent.Semaphore;
/**
 * @author Miguel
 */
public class Main {
    Semaphore bankAccountSemaphore = new Semaphore(1);
    BankAccount bank = new BankAccount(bankAccountSemaphore);
    
    
    
}
