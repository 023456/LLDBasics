package AdderSubtractorMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock lock = new ReentrantLock();//mutex
        Adder add = new Adder(v,lock);
        Subtractor sub = new Subtractor(v,lock);

        ExecutorService exe = Executors.newCachedThreadPool();
        Future<Integer> addft = exe.submit(add);
        Future<Integer> subft = exe.submit(sub);

       Integer getaddvalue = addft.get();
       Integer getsubvalue = subft.get();
       System.out.println(getaddvalue);
       System.out.println(getsubvalue);
        System.out.println(v.num);
    }
}
