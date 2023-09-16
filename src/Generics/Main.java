package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Printer<Integer> intPrinter = new Printer<>(12);
//        Printer<Double> doublePrinter = new Printer<>(5.90);
//        Printer<String> stringPrinter = new Printer<>("hi");
//        intPrinter.print();
//        doublePrinter.print();
//        stringPrinter.print();


//        Adder.swap("fatema","Hasan");

//        Pair<Integer,Integer> pair = new Pair<>(2,8);
//        pair.printFirstAndSecond();

        Dog d1 = new Dog("black",28, "Fatema");
        Dog d2 = new Dog("Black",5,"Laddoo Rangoonwala");
        Pair<Dog,Dog> p1 = new Pair<>(d1,d2);
        p1.printFirstAndSecond();
        p1.printListofFirst(Arrays.asList(d1, d2 ));


        Pair<Animal,Animal> p2 = new Pair<>(d1,d2);
        p2.printListofFirst(Arrays.asList(d1, d2));


        Pair<String, Integer> p3 = new Pair<>("ss", 12);
        p3.printListofFirst(Arrays.asList("dwad"));

    }
}
