package main.others;

import java.util.concurrent.*;

/**
 * test CountDownLatch2
 *
 * @author
 * @create 2019-05-26 下午4:37
 **/
public class Driver2 {




    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        Executor executor = new ThreadPoolExecutor(10,20,200,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(10));
        for (int i=0;i<10;i++){
            executor.execute(new Worker(i,countDownLatch));
        }

        countDownLatch.await();

        System.out.println("all done");
    }
}
