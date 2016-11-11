package psp_ejercicio7.Fibonacci;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Miguel
 */
public class ConsumerFibo extends Thread{
    BlockingQueue queue;
    private static final int ITERATIONS_NUMBER = 10;
    
    public ConsumerFibo(BlockingQueue queue) {
        this.queue = queue;
    }
    
    public void run() {
        for ( int i = 0; i< ConsumerFibo.ITERATIONS_NUMBER; i++) {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException ex) {
                Logger.getLogger(ConsumerFibo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
