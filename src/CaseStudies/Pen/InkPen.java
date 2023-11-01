package CaseStudies.Pen;

public class InkPen extends Pen{
    private Ink ink;
    private Nib nib;

    public InkPen(int size, String name, String brand, int price, PenState penState, OpenAndCloseBehaviour behaviour, Ink ink, Nib nib) {
        super(size, name, brand, price, penState, behaviour);
        this.ink = ink;
        this.nib = nib;
    }


    @Override
    public String toString() {
        return "InkPen{" +
                "ink=" + ink +
                ", nib=" + nib +
                '}';
    }
}
