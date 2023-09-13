package mutex09sept;

public class Counter{
    private int count;

    public Counter(int count){
        this.count = count;
    }

    public synchronized   void incValue(int offset){
        System.out.println("inc value before for offset  " + offset + " count " + this.count);
        this.count = offset + this.count;
        System.out.println("inc value after for offset  " + offset + " count " + this.count);

    }

    public synchronized int getValue(){
        return this.count;
    }

    public  void decValue(int offset){
        this.count = this.count - offset;
        System.out.println("dec value" + this.count);
    }
}