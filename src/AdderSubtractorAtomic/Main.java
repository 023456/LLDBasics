package AdderSubtractorAtomic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder add = new Adder(v);
        Subtractor sub = new Subtractor(v);

        ExecutorService exe = Executors.newCachedThreadPool();
        Future<Integer> addft = exe.submit(add);
        Future<Integer> subft = exe.submit(sub);

       Integer getaddvalue = addft.get();
       Integer getsubvalue = subft.get();
//       System.out.println(getaddvalue);
//       System.out.println(getsubvalue);
        System.out.println(v.atomicInteger.get());
    }
}
