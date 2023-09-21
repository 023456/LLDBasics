package LowerBound;

import java.util.List;

public class FruitProcessor {

    public static void process(List<? super Apple> fruit) {
        System.out.println(fruit.getClass().getSimpleName());
    }
}
