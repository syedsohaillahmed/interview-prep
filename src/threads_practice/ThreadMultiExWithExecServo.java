package threads_practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMultiExWithExecServo {
    static void main() {
        ExecutorService es = Executors.newFixedThreadPool(2);

        es.submit(()->{
            for (int i=0; i<3; i++){
                final int task = i;

                System.out.println("thread started"+ task );
                System.out.println("thread executed with"+ Thread.currentThread().getName());
            }
        });
    }
}
