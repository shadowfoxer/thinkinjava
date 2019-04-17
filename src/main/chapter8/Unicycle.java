package main.chapter8;

/**
 * child class
 *
 * @author
 * @create 2019-04-10 上午12:18
 **/
public class Unicycle extends Cycle {


    @Override
    public void sayHi() {
        System.out.println("this is unicycle");
    }

    @Override
    public void didi() {
        System.out.println("unicycle didi");
    }

    public void name(){
        System.out.println("call you unicycle");
    }
}
