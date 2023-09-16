package Generics;

public class Adder {
    public  static <T> void  swap(T a , T b){
        System.out.println("Before value of a is "+a);

        T temp =a;
        a=b;
        b=temp;
        System.out.println("After value of a is "+a);

    }

}
