package Practiceoct;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Printer<Integer> p1 = new Printer<>(12);
//        Printer<Double> p2 = new Printer<>(21.78);
//        Printer<String> p3 = new Printer<>("Hello Printer");
//        p1.print();
//        p2.print();
//        p3.print();
//        Adder.swap("Fatema","Hasan");

//        Pair<Integer,Double> p1 = new Pair<>(23,27.9);
//        List<Integer> l1 = new ArrayList<>();
//        l1.add(21);
//        l1.add(34);
//        l1.add(43);
//        l1.add(56);
//        p1.printListofFirst(l1);

//        p1.setFirst(28);
//        p1.setSecond(34.5);
//        p1.printFirstAndSecond();

//        System.out.println(p1.getFirst());
//        System.out.println(p1.getSecond());

//        Dog d1 = new Dog("Blue" , 29 ,"Fatema");
//        Dog d2 = new Dog("Black",5,"Laddoo Rangoonwala");
////        Pair<Dog, Dog> pair1 = new Pair<>(d1,d2);
//////        pair1.printFirstAndSecond();
////        pair1.printListofFirst(Arrays.asList(d1,d2));
//
//        Pair<Animal, Animal> pair2 = new Pair<>(d1,d2);
//        pair2.printListofFirst(Arrays.asList(d1,d2));

//        Printer.getValue(12);
//        Printer<Integer> p1 = new Printer<>(21);
//        p1.getValue();

//        Pair<Integer,Integer> p1 = new Pair<>(12,14);
////        p1.doSomethingOnFirst("Hasan");
//          p1.printMoreFirsts(Arrays.asList(19,20,24,25));
//

    Dog d1 = new Dog("Black",1,"Jenie",4);
//    System.out.println(d1);
    Pair<Dog,Dog> p1 = new Pair<>(d1,d1);
//    System.out.println(p1.getFirst());
//    System.out.println(p1.getSecond());

        List<Dog> l1 = new ArrayList<>();
        Dog d2 = new Dog("white",2,"jemie",5);
        Dog d3 = new Dog("Black",4,"jem",6);
//        p1.printMoreFirsts(Arrays.asList(d1,d2,d3));

        Animal a1 = new Animal("black&white",9,"mary");
        Pair<Animal,Animal> p2 = new Pair<>(a1,a1);
//        p2.doSomethingOnFirst(a1);

        p2.printMoreFirstsAgain(Arrays.asList(d1,d2,d3));














    }
}
