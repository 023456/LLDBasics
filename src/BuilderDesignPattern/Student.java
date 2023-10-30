package BuilderDesignPattern;

public class Student {
    private String name;
    private int age;
    private String univName;
    private  String batchName;
    private  String phone;

    public Student(Builder builder) {
        if (builder.getAge() > 100) {
            throw new RuntimeException("Age greater than 100");

        }
        this.age = builder.getAge();
        this.batchName = builder.getBatchName();
        this.name = builder.getName();
        this.univName = builder.getUnivName();
        this.phone = builder.getPhone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", univName='" + univName + '\'' +
                ", batchName='" + batchName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
