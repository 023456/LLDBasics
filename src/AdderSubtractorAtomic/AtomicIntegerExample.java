package AdderSubtractorAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);

        // Create and start multiple threads to increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                int newValue = counter.incrementAndGet(); // Increment and get the new value
                System.out.println("Thread 1: Incremented to " + newValue);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                int newValue = counter.incrementAndGet(); // Increment and get the new value
                System.out.println("Thread 2: Incremented to " + newValue);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        int finalValue = counter.get();
        System.out.println("Final Value: " + finalValue);
    }
}
