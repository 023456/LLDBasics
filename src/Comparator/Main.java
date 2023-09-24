package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student(1,23,"Mary",91);
//        Student s2 = new Student(5,27," MarieGold",97);
//        Student s3 = new Student(2,24,"Rose",92);
//        Student s4 = new Student(7,29,"Tulip",99);

        List<Student> students = new ArrayList<>();
        students.addAll(List.of(
                new Student(1,23,"Mary",91),
                new Student(5,27," MarieGold",97),
                new Student(2,24,"Rose",92),
                new Student(7,29,"Tulip",99)
        ) );
        Collections.sort(students, new StudentComparatorByPSP());
        System.out.println(students);









    }
}
