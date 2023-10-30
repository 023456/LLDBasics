package Practiceoct;

public class Dog extends Animal {
    private int weight;

    public Dog(String color, int age, String name, int weight) {
        super(color, age, name);
        this.weight = weight;
    }
}
