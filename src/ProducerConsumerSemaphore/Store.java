package ProducerConsumerSemaphore;

import java.util.ArrayList;

public class Store {
    private int maxSize;
    private ArrayList<Object> item;

    public Store(int maxSize){
        this.maxSize = maxSize;
        this.item = new ArrayList<>();
    }

    public void add(){
        if(item.size()>=maxSize){
            return;
        }
        item.add(new Object());
        System.out.println("Adding items in store, count " + this.item.size());

    }

    public  void remove(){
        if(!item.isEmpty()){
          item.remove(item.size()-1);
            System.out.println("Adding items in store, count " + this.item.size());
        }


    }






}
