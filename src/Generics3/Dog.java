package Generics3;

public class Dog extends Animal {
    private int height;

    public Dog(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }
}
