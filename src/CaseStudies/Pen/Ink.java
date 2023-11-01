package CaseStudies.Pen;

import java.util.List;

public class Ink {
    private String Color;
    private int density;
    List <InkFeature> inkFeature;

    public Ink(String color, int density, List<InkFeature> inkFeature) {
        Color = color;
        this.density = density;
        this.inkFeature = inkFeature;
    }

    @Override
    public String toString() {
        return "Ink{" +
                "Color='" + Color + '\'' +
                ", density=" + density +
                ", inkFeature=" + inkFeature +
                '}';
    }
}
