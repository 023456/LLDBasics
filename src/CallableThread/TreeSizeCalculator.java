package CallableThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


public class TreeSizeCalculator implements Callable<Integer> {
    private Node root;
    private ExecutorService ex;


    public TreeSizeCalculator(Node root, ExecutorService ex){
        this.root = root;
        this.ex = ex;

    }

    @Override
    public Integer call() throws ExecutionException, InterruptedException {
        if(this.root == null){
            return 0;
        }
        Future<Integer> left = this.ex.submit(new TreeSizeCalculator(this.root.left, this.ex));
        Future<Integer> right = this.ex.submit(new TreeSizeCalculator(this.root.right, this.ex));

        return left.get() + right.get() +1;






    }


}