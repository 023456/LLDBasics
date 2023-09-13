package AdderSubtractorSynchronizedMethods;

public class Value {
    private int num = 0;

    public synchronized void incrementBy(int num){
        this.num = this.num + num;
    }

    public synchronized void decrementBy(int num){
        this.num = this.num - num;
    }

    public int getNum(){
        return num;
    }


}
