package Practiceoct;

public class Animal {
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
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +

                '}';
    }
}
