package main.DesignPattern.Proxy;

/**
 * test
 *
 * @author
 * @create 2019-04-19 下午9:12
 **/
public class Test {


    public static void main(String[] args){

        Person person = new ForgineProxy(new Forgine());

        person.speak();
    }
}
