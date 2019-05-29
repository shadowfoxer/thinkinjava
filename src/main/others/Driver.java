package main.others;

import java.util.concurrent.CountDownLatch;

/**
 * test CountDownLatch
 *
 * @author
 * @create 2019-05-24 上午11:28
 **/
public class Driver {

    public static final int N = 10;

    void test() throws InterruptedException {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch donwnSignal = new CountDownLatch(N);

        for (int i=0;i<N;i++){

            new Thread(new Work(startSignal,donwnSignal,i)).start();

        }

        System.out.println("test begin run");
        startSignal.countDown();
        System.out.println("test running");
        donwnSignal.await();
        System.out.println("test run done");

    }

    class Work implements Runnable{
        private final CountDownLatch startSignal;
        private final CountDownLatch donwnSignal;
        public int id;

        public Work(CountDownLatch startSignal, CountDownLatch donwnSignal, int id) {
            this.startSignal = startSignal;
            this.donwnSignal = donwnSignal;
            this.id = id;
        }

        public void run(){
            try{
                startSignal.await();
                System.out.println(this.id + " is working");
                donwnSignal.countDown();

            }catch (InterruptedException e){
                System.out.println(e.toString());
            }
        }


    }

    public static void main(String[] args){
        Driver driver = new Driver();


        try {
            driver.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
