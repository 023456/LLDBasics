package CaseStudies.Pen;

public class ClickOpenClose implements OpenAndCloseBehaviour{
    @Override
    public void open() {
        System.out.println("Clicked");
    }

    @Override
    public void close() {
        System.out.println(" UnClicked");

    }
}
