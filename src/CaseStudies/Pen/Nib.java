package CaseStudies.Pen;

public class Nib {
    private int Radius;
    private NibType nibtype;

    public Nib(int radius, NibType nibtype) {
        Radius = radius;
        this.nibtype = nibtype;
    }

    @Override
    public String toString() {
        return "Nib{" +
                "Radius=" + Radius +
                ", nibtype=" + nibtype +
                '}';
    }
}
