package CallableThread1;

import java.util.Scanner;
import java.util.List;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;


public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayCreator task = new ArrayCreator(n);
        ExecutorService executorService =  Executors.newCachedThreadPool();
        Future<List<Integer>> ft = executorService.submit(task);
        System.out.println(ft.get());

    }
}
