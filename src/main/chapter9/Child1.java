package main.chapter9;

/**
 * 子类
 *
 * @author
 * @create 2019-04-13 上午1:37
 **/
public class Child1 extends Base1 {

    public static void show( Base1 base1){
//        Child1 child1 = (Child1)base1;
//        child1.print();
        base1.print();
        System.out.println("child static method");
    }

    public void print(){
        System.out.println("child normal method");
    }

    @Override
    public void saysth() {
        System.out.println("this is child");
    }
}
