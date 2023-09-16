package Generics;

public abstract class  Animal {
    private String color;
    private int age;
    private String name;

    public Animal(String color, int age, String name) {
        this.color = color;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
       String printName = String.format("Animal name is %s age is %s color is %s", name,age,color);
       return printName;
    }
}
