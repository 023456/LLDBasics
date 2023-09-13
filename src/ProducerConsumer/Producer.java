package ProducerConsumer;

import java.util.concurrent.ExecutorService;

public class Producer implements  Runnable{
    private Object obj;
    private Store store;
    public Producer(Object obj, Store store){
        this.obj = obj;
        this.store = store;

    }
    @Override
    public  void run() {
        while(true){
            synchronized (this.store) {
                store.add(this.obj);
            }
        }
    }
}
