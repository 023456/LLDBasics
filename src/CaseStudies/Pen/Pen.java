package CaseStudies.Pen;

import BuilderDesignPattern.Builder;

public abstract class Pen {
    protected int size;
    protected String name;
    protected String brand;
    protected int price;
    protected PenState penState;
    protected OpenAndCloseBehaviour behaviour;

    public Pen() {

    }
    public Pen(int size, String name, String brand, int price, PenState penState,OpenAndCloseBehaviour behaviour) {
        this.size = size;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.penState = penState;
        this.behaviour = behaviour;
    }

    public void write() throws PenCloseException {
        if (this.penState == PenState.OPEN)
            System.out.println("Writing......");
        else {
            throw new PenCloseException("Open the pen First");
        }
    }

    public void open() {
        if (penState == PenState.OPEN) {
        } else {
            this.behaviour.open();
            this.penState = PenState.OPEN;
        }

    }

    public void close() {
        if (penState == PenState.CLOSE) {
            return;
        }
        this.behaviour.close();
        this.penState = PenState.CLOSE;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", penState=" + penState +
                '}';
    }
}
