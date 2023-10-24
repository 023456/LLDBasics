package Practiceoct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Adder add = new Adder(x,y);
        Thread t1 = new Thread(add);
        t1.start();


    }
}
