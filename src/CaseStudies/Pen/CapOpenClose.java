package CaseStudies.Pen;

public class CapOpenClose implements OpenAndCloseBehaviour {
    @Override
    public void open() {
     System.out.println("Cap is opened");
    }

    @Override
    public void close() {
        System.out.println("Cap is closed");

    }
}
