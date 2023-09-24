package Comparator;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int id;
    int age;
    String name;
    int psp;

    public Student(int id, int age, String name, int psp) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.psp = psp;
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.equals(o.name)) {
            return 0;
        }

        if (this.name.compareTo(o.name) < 0) {
            return -1;
        }
        return 1;

    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                '}';
    }
}
