package Assignments;

public class Swap {

    public static  <T> void swapElements(T i , T j){
        System.out.println("Before Swapping" +i+" , "+j);
        T temp = i;
        i = j;
        j = temp;

        System.out.println("After Swapping" +i+" , "+j);

    }
}
