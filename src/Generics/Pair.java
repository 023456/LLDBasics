package Generics;

import java.util.List;

public class Pair<T,E> {
    private T first;
    private E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(E second) {
        this.second = second;
    }
    public void printFirstAndSecond(){
        System.out.println(first);
        System.out.println(second);
    }

    public void printListofFirst(List<? extends T> lists){
        for(T list: lists){
            System.out.println(list);

        }
    }
}
