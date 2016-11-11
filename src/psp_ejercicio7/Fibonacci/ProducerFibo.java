package psp_ejercicio7.Fibonacci;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Miguel
 */
public class ProducerFibo extends Thread {

    private int f1;
    private int f2;
    private int fn;
    private static final int ITERATIONS_NUMBER = 10;
    private BlockingQueue queue;

    public ProducerFibo(BlockingQueue queue) {
        this.queue = queue;
        f1 = 0;
        f2 = 1;
    }

    public void run() {
        
        for ( int i = 0; i< ProducerFibo.ITERATIONS_NUMBER; i++) {
            fn = f1 + f2;
            try {
                queue.put(fn);
                f1 = f2;
                f2 = fn;
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerFibo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
