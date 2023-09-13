package AdderSubtractorAtomic;

import java.util.concurrent.Callable;

public class Adder implements Callable<Integer> {
    private Value v;
    public Adder(Value v){
        this.v = v;
    }


    @Override
    public Integer call() throws Exception {
       for(int i=1;i<=5000;i++){
           this.v.atomicInteger.addAndGet(i);
       }
       return  null;
    }
}
