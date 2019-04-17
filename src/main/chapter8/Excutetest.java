package main.chapter8;

/**
 * 执行类
 *
 * @author
 * @create 2019-04-10 上午12:19
 **/
public class Excutetest {

    public static void test(Cycle cycle){
        cycle.ride();
        cycle.sayHi();
    }

    public static void main(String[] args){

//        test(new Unicycle());

        Super sup = new Sub();
        System.out.println("sup.field = "+sup.field +
        ", sup.getField() =" + sup.getField());

        Sub sub = new Sub();
        System.out.println("sub.field = "+sub.field+", sub.getField() ="+sub.getField() +
        ", sub.getSuperField() =" + sub.getSuperField());

    }
}
