package class2;

public class D extends C {
    String batchName = "oct";
    public D(){
        super("Fatema");
        System.out.println("D is child clas");
    }
    public D(String batchName){
        super("fatema");
        System.out.println(batchName);
    }
}
