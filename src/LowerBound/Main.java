package LowerBound;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fruits apple = new Apple();
        Orange orange = new Orange();
//        FruitProcessor.process(apple);
//        FruitProcessor.process(orange);
        FruitProcessor.process(Arrays.asList(apple,orange,3,9,10.00,"laddooobeta"));
    }
}
