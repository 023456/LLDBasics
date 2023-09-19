package GenericsAssignment;

public class Main {
    public static void main(String[] args) {
        CustomQueue<Integer> q1 = new CustomQueue<>();
        q1.push(20);
        q1.push(45);
        System.out.println(q1.pop());
        System.out.println(q1.peek());
        System.out.println(q1.pop());
        System.out.println(q1.isEmpty());

    }

}
