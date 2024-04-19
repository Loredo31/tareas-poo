package mx.utng.s27.reto01;

import java.util.concurrent.TimeUnit;
public class Hilo2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Hilo2: Sigo en ejecucion");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
