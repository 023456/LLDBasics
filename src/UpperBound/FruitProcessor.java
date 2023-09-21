package UpperBound;

public class FruitProcessor {
    public static <T extends  Fruits> void process(T fruit){
        System.out.println(fruit.getColor());

    }
}
