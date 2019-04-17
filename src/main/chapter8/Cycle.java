package main.chapter8;

/**
 * base class
 *
 * @author
 * @create 2019-04-10 上午12:16
 **/
public class Cycle {

    public void ride(){
        System.out.println("cycle ride");
        didi();
    }

    public void sayHi(){
        System.out.println("this is cycle");
    }

    public void didi(){
        System.out.println("cycle didi");
    }

    private void name(){
        System.out.println("call you cycle");
    }
}
