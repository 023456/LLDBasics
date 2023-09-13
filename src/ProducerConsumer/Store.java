package ProducerConsumer;

import java.util.ArrayList;

public class Store {
    private final int maxSize;
    private  ArrayList<Object> items;
    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(Object obj){
        if(items.size()>=maxSize){
            return;
        }
        items.add(obj);
     System.out.println("Adding items in store, count " + this.items.size());
    }

    public void remove(){
        if(!this.items.isEmpty()){
            this.items.remove(this.items.size()-1);
            System.out.println("Removing items in store, count " + this.items.size());
        }
    }

}
