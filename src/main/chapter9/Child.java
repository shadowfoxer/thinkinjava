package main.chapter9;

/**
 * 子类
 *
 * @author
 * @create 2019-04-11 上午2:39
 **/
public class Child extends Base {

    private int i = 123;

    @Override
    public void show() {
        System.out.println(i);
    }
}
