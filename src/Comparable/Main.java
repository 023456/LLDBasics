package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,23,"Mary", 78);
        Student s2 = new Student(2,21,"Rose", 90);
        Student s3 = new Student(3,25,"tulip", 95);
        Student s4 = new Student(5,27,"Jasmine", 99);
        List<Student> list = Arrays.asList(s1,s2,s3,s4);
        Collections.sort(list);
        System.out.println(list);



    }
}
