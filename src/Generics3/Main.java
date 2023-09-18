package Generics3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog("Fatema", 20,19,6);
        Pair<Dog,Dog> p1 = new Pair<>(d1,d1);
//        System.out.print(p1.getFirst());

        List<Dog> l1 = new ArrayList<>();
        Dog d2 = new Dog("Laddoo", 5, 8,3);
        Dog d3 = new Dog("hasan" , 6,9,8);
        p1.printMoreFirst(Arrays.asList(d1,d2,d3));


        Animal a1 = new Animal("gopal" , 20 , 30);
        Pair<Animal,Animal> p2 = new Pair<>(a1,a1);
        p2.doSomethingonFirst(a1);

        p2.printMoreFirstsAgain(Arrays.asList(d1,d2,d3));







    }

}
