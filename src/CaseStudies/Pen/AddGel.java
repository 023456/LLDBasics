package CaseStudies.Pen;

public class AddGel extends GelPen implements Refillable{
   private Refill refill;

    public AddGel(int size, String name, String brand, int price, PenState penState, OpenAndCloseBehaviour behaviour, Refill refill) {
        super(size, name, brand, price, penState, behaviour);
        this.refill = refill;
    }


    @Override
    public void changeRefill(Refill newRefill) {
       this.refill=newRefill;
    }

    @Override
    public String toString() {
        return "AddGel{" +
                "refill=" + refill +
                "} " + super.toString();
    }
}
