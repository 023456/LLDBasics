package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Object obj;
    private Store store;
    private Semaphore prodsema;
   private  Semaphore consumsema;


    public Producer(Object obj , Store store , Semaphore prodsema , Semaphore consumsema){
        this.obj = obj;
        this.store = store;
        this.prodsema = prodsema;
        this.consumsema = consumsema;

    }

    @Override
    public void run() {
        while(true){

        try {
            prodsema.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.add();
        consumsema.release();
            }

        }

    }

