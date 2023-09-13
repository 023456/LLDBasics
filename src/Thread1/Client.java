package Thread1;

import java.util.*;
public class Client{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            TableCreator task = new TableCreator(i);
           Thread t1 = new Thread(task);
            t1.start();

        }



    }
}