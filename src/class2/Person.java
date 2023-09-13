package class2;

public class Person {
    private String name;

    public void greet(){
        System.out.println("Hello, my name is " + name);
    }

   void introduce(){
        System.out.println("I am" + name);
    }

    protected void farewell(){
        System.out.println("Good Bye " +name);
    }

}
