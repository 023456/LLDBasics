package AdderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Integer> {
    private Value v;
    private Lock lock;
    public Adder(Value v , Lock lock){

        this.v = v;
        this.lock = lock;
    }


    @Override
    public Integer call() throws Exception {
       for(int i=1;i<=5000;i++){
           lock.lock();
           this.v.num = this.v.num + i;
      System.out.println("Adding "+i);
           lock.unlock();
       }
       return  this.v.num;
    }
}
