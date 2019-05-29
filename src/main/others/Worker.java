package main.others;

import java.util.concurrent.CountDownLatch;

/**
 * test countdownlatch
 *
 * @author
 * @create 2019-05-26 下午4:58
 **/
public class Worker implements Runnable {
    private final int i;
    private final CountDownLatch doneSignal;

    public Worker(int i, CountDownLatch doneSignal) {
        this.i = i;
        this.doneSignal = doneSignal;
    }

    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(1000);
            System.out.println("this is " + i);
            doneSignal.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
