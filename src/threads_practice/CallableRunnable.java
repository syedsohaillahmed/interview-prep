package threads_practice;

import java.util.concurrent.*;

public class CallableRunnable {
    static void main() {
        Runnable task = ()-> {
            System.out.println("task started");
        };

        Thread t = new Thread(task);
        t.start();

        Callable<Integer> task2 = ()->{
            return 10+20;
        };

        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<Integer> future = es.submit(task2);
        try {
            Integer i = future.get();
            System.out.println(i);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        es.shutdown();
    }
}
