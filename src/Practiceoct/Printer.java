package Practiceoct;

public class Printer <T>{
    private T value;

    public Printer(T value) {
        this.value = value;
    }

    public T getValue() {
        System.out.println("Value is " +value);
        return value;
    }
}