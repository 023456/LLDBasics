package CaseStudies.Pen;

import java.util.Collections;

public class Client {
    public static void main(String[] args) throws PenCloseException {
        OpenAndCloseBehaviour behaviour = new CapOpenClose();



        Refill refill = new Refill("Blue", 5, 1);
        BallPen ballpen1 = BallPen.getBuilder().setSize(1).setName("cellopen")
                .setPenState(PenState.CLOSE).setBrand("Cello")
                .setBehaviour(behaviour).setPrice(8).setRefill(refill).build();


        ballpen1.open();
        ballpen1.write();
        ballpen1.close();
        System.out.println("ballpen1 with builder " +ballpen1);

        Pen ballpen = new BallPen(1, "cellopen", "cello", 5, PenState.CLOSE, behaviour, refill);

        ballpen.open();
        ballpen.write();
        ballpen.close();

        OpenAndCloseBehaviour behaviour1 = new ClickOpenClose();
        Refill newrefill = new Refill("Black", 9, 1);
        AddGel gelpen = new AddGel(4, "Reynoldsgel", "Cello", 7, PenState.CLOSE, behaviour1, refill);
        gelpen.open();
        gelpen.write();
        gelpen.close();
        gelpen.changeRefill(newrefill);
        System.out.println(gelpen);


        Nib nib = new Nib(22, NibType.MEDIUM);
        Ink ink = new Ink("Blue", 33, Collections.singletonList(InkFeature.SPARKLING));
        Pen inkPen = new InkPen(1, "Celloinkpen", "cello", 55, PenState.OPEN, behaviour, ink, nib);
        inkPen.open();
        inkPen.write();
        inkPen.close();




    }
}
