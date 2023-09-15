package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable{
    private Store store;
    private Semaphore consumesema;
    private Semaphore prodsema;

    public Consumer(Store store, Semaphore prodsema, Semaphore consumesema){
        this.store = store;
        this.prodsema = prodsema;
        this.consumesema = consumesema ;
    }


    @Override
    public void run() {
        while(true){
            try {
                consumesema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.remove();
            prodsema.release();

        }
    }
}
