//package CaseStudies.Pen;
//
//public class PenBuilder {
//    private int size;
//    private String name;
//    private String brand;
//    private int price;
//    private PenState penState;
//    private OpenAndCloseBehaviour behaviour;
//    private  Refill refill;
//
//    public int getSize() {
//        return size;
//    }
//
//    public PenBuilder setSize(int size) {
//        this.size = size;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public PenBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public PenBuilder setBrand(String brand) {
//        this.brand = brand;
//        return this;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public PenBuilder setPrice(int price) {
//        this.price = price;
//        return this;
//    }
//
//    public PenState getPenState() {
//        return penState;
//    }
//
//    public PenBuilder setPenState(PenState penState) {
//        this.penState = penState;
//        return this;
//    }
//
//    public OpenAndCloseBehaviour getBehaviour() {
//        return behaviour;
//    }
//
//    public PenBuilder setBehaviour(OpenAndCloseBehaviour behaviour) {
//        this.behaviour = behaviour;
//        return this;
//    }
//
//    public Refill getRefill() {
//        return refill;
//    }
//
//    public PenBuilder setRefill(Refill refill) {
//        this.refill = refill;
//        return this;
//    }
//
//    public Pen build(){
//        return new BallPen(this);
//    }
//}
