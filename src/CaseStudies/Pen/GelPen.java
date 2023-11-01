package CaseStudies.Pen;


public abstract class GelPen extends Pen {


    public GelPen(int size, String name, String brand, int price, PenState penState, OpenAndCloseBehaviour behaviour) {
        super(size, name, brand, price, penState, behaviour);
    }

    @Override
    public void write() throws PenCloseException {
        super.write();
    }

    @Override
    public void open() {
        super.open();
    }

    @Override
    public void close() {
        super.close();
    }
}
