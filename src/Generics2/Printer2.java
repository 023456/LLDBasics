package Generics2;

public class Printer2<T> {
    private T value;

    public Printer2(T value) {
        this.value = value;
    }

    public T getValue() {
        System.out.println("Value is " +value);
        return value;
    }





}
