package psp_ejercicio5.bancos;

import java.util.Random;

public class Injector extends Thread {

    private CuentaBancaria cuenta;

    private static final int ITERATIONS_NUMBER = 10;

    public Injector(CuentaBancaria c) {
        cuenta = c;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        for (int i = 0; i < this.ITERATIONS_NUMBER; i++) {
            int value = rnd.nextInt(100);
            cuenta.put(value);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
