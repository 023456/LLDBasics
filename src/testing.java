import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.Vector;

public class testing {
    public static void main(String[] args) {
        LinkedHashSet<Integer> v1 = new LinkedHashSet<Integer>();
        v1.add(12);
        v1.add(13);
        v1.add(14);
        v1.add(null);
        v1.remove(12);
        v1.add(50);
        v1.add(67);
        v1.add(12);



        for(Integer v : v1){
            System.out.print(v+" ");
        }

    }


}
