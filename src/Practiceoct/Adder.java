package Practiceoct;

public class Adder implements Runnable {
    int a;
    int b;
    public Adder(int num1 , int num2){
        this.a =  num1;
        this.b = num2;
    }
    @Override
    public void run() {
       System.out.println(this.a + this.b);
    }
}
