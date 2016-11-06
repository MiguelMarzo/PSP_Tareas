package psp_ejercicio5.bancos;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class InjectorExtractorMain {

    /**
    * Entry point of the application
    *
    * @param args
    */
    public static void main(String[] args) {
        
        BlockingQueue<Integer> queue = new SynchronousQueue<Integer>();
          
        CuentaBancaria c = new CuentaBancaria();
        Injector injector = new Injector(c);
        Extractor consumer = new Extractor(c);

        injector.start();
        consumer.start();
    }
}

