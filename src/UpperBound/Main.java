package UpperBound;

public class Main {
    public static void main(String[] args) {
        Fruits apple = new Apple();
        Orange orange = new Orange();
        FruitProcessor.process(apple);
        FruitProcessor.process(orange);
    }
}
