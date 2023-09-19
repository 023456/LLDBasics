package GenericsAssignment;

import java.util.Stack;

public class CustomQueue<T> {

    Stack<T> stk1;
    Stack<T> stk2;


    public CustomQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }

    public void push(T x) {
        stk1.push(x);
    }

    public T pop() {
        T p = null;
        if(stk1.size()==1){
            return stk1.pop();
        }

        while (stk1.size() > 1) {
            stk2.push(stk1.pop());
        }
        p = stk1.pop();

        while (!stk2.isEmpty()) {
            stk1.push(stk2.pop());
        }
        return p;

    }

    public T peek() {
        T p = null;
        if (stk1.isEmpty()) {
            return null;
        }

        while (stk1.size() > 1) {
            stk2.push(stk1.pop());
        }
        p = stk1.peek();

        while (!stk2.isEmpty()) {
            stk1.push(stk2.pop());
        }

        return p;
    }
    public boolean isEmpty() {
        return stk1.isEmpty();
    }

}
