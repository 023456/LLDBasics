package Generics3;

public class Animal {
    String name;
    int age;
    int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
     return String.format("name is %s and age is %s and weight is %s", name,age,weight);
    }


}
