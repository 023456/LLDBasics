package Comparator;

import java.util.Comparator;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && psp == student.psp && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name, psp);
    }
}
