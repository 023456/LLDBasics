package ProducerConsumer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(10);
        ExecutorService exec = Executors.newCachedThreadPool();

        for(int i=0;i<2;i++){
            exec.execute(new Producer(new Object(), store));
        }

        for(int i=0;i<3;i++){
            exec.execute(new Consumer(store));
        }

    }
}
