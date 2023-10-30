package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {

//       Builder builder = new Builder().setAge(21).setName("Fatema");
        Student student = new Student(Student.getBuilder().setName("Fatema").setAge(21));
        Student student1 = Student.getBuilder().setName("Fatema").setAge(21).build();
        System.out.println(student);
    }
}
