package ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore prodSema = new Semaphore(5);
        Semaphore consSema = new Semaphore(0);
        Store store = new Store(10);
        ExecutorService exec = Executors.newCachedThreadPool();

        for(int i=0;i<=2 ;i++){
            exec.execute(new Producer(new Object(),store, prodSema,consSema));
        }

        for(int i=0;i<=3 ;i++){
            exec.execute(new Consumer(store,prodSema,consSema));
        }
    }



}
