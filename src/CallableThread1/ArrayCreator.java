package CallableThread1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable <List<Integer>> {
    int n ;

    public ArrayCreator(int n){
        this.n = n;
    }

   @Override
    public List<Integer> call() throws Exception {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=1; i<=n ;i++){
            ar.add(i);
        }
        return  ar;


   }


}