package Collections3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EnumSet<PaymentStatus> en = EnumSet.allOf(PaymentStatus.class);
        System.out.println(en);

        EnumSet<PaymentStatus> en1 = EnumSet.of(PaymentStatus.SUCCESS, PaymentStatus.FAILED);
        EnumSet<PaymentStatus> en2 = EnumSet.copyOf(en);
        System.out.println(en1);
        System.out.println(en2);

        EnumSet<PaymentStatus> en4 = EnumSet.complementOf(en);
        System.out.println(en4);

        for(PaymentStatus paymentStatus: PaymentStatus.values()) {

            //enum to string
            String ss = paymentStatus.name();
            System.out.println(paymentStatus);
            System.out.println(ss);
        }
        //String to enum
;       PaymentStatus paymentStatus = PaymentStatus.valueOf("SUCCESS");
        System.out.println(paymentStatus);

        List<Payment> list = new ArrayList<>();

        Payment p1 = new Payment(PaymentStatus.SUCCESS);
        Payment p2 = new Payment(PaymentStatus.FAILED);
        Payment p3 = new Payment(PaymentStatus.AWAITING_BANK_APPROVAL);
        Payment p4 = new Payment(PaymentStatus.PENDING);
        List<Payment> list1 = Arrays.asList(p1,p2);

        list.addAll(list1);
        list = Arrays.asList(p1,p2,p3,p4);
        System.out.println(list);

    }
}
