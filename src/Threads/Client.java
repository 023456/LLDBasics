package Threads;

public class Client{
    public static void main(String[] args){
        System.out.println("I am the main class");


        Adder add = new Adder();
        Thread t1 = new Thread(add);
        t1.start();


        Subtractor sub = new Subtractor();
        Thread t2 = new Thread(sub);
        t2.start();


    }
}