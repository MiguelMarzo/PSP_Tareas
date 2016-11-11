package psp_ejercicio7.Fibonacci;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author Miguel
 */
public class Main {
    
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new SynchronousQueue<Integer>();
        ProducerFibo producer = new ProducerFibo(queue);
        ConsumerFibo consumer = new ConsumerFibo(queue);
        producer.start();
        consumer.start();
    }
}
