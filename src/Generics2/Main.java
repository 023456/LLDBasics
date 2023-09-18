package Generics2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Printer<Integer> p1 = new Printer<>(12);
//        Printer<String> p2 = new Printer<>("Fatema");
//        Printer.getValue(12);
//        Printer.getValue("Fatema");


//        Printer2<Integer> p1 =new Printer2<>(12);
//        Printer2<String> p2 = new Printer2<>("Laddoo");
//        p1.getValue();
//        p2.getValue();


        Pair<Integer,String> p1 = new Pair<>(12,"Laddoo Gopal");

//        System.out.println( p1.getFirst());
//        System.out.println(p1.getSecond());

//        p1.doSomethingonFirst(13);
        p1.printMoreFirst(Arrays.asList(19,20,21));




    }
}
