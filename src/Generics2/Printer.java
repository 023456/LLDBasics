package Generics2;

public class Printer<T> {
    private int value;

    public Printer(int value) {
        this.value = value;
    }

    public static <T> void  getValue(T value){
        System.out.println("Value is " +value);
    }

}
