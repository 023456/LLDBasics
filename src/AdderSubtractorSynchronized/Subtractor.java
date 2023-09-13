package AdderSubtractorSynchronized;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Integer> {
private Value v;

    public Subtractor(Value v){
        this.v = v;
    }


    @Override
    public Integer call() throws Exception {
        for(int i=1;i<=5000;i++){
            synchronized (this.v) {
                this.v.num = this.v.num - i;
            }
        }
        return this.v.num;
    }
}
