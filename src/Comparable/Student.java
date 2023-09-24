package Comparable;

public class Student implements Comparable<Student> {
    int id;
    int age;
    String name;
    double psp;


    public Student(int id, int age, String name, double psp) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.psp = psp;
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
    public int compareTo(Student o) {
        // age wise
        if(this.age > o.age){
          return 1;
        }
        else if(this.age<o.age){
            return -1;
        }
        else{
            return  0;
        }
    }
}
