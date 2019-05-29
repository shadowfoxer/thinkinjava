package main.DesignPattern.Proxy;

/**
 * 外国人
 *
 * @author
 * @create 2019-04-19 下午9:10
 **/
public class Forgine implements Person {

    @Override
    public void speak() {
        System.out.println("speak english");
    }
}
