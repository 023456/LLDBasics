package mutex09sept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Counter ct = new Counter(10);
        ExecutorService exe = Executors.newCachedThreadPool();

        for (int  i = 0; i<10; i++) {
            int finalI = i;
            exe.execute( () -> {
                ct.incValue(finalI);
                    }
            );
        }
    }
}
