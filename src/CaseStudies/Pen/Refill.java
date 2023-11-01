package CaseStudies.Pen;

public class Refill {
    private String inkColor;
    private int cost;
    private int size;

    public Refill(String inkColor, int cost, int size) {
        this.inkColor = inkColor;
        this.cost = cost;
        this.size = size;
    }


    @Override
    public String toString() {
        return "Refill{" +
                "inkColor='" + inkColor + '\'' +
                ", cost=" + cost +
                ", size=" + size +
                '}';
    }
}
