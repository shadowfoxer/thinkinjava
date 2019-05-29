package main.DesignPattern.Proxy;

/**
 * 翻译
 *
 * @author
 * @create 2019-04-19 下午9:10
 **/
public class ForgineProxy implements Person {



    Person person;

    public ForgineProxy(Person person) {
        this.person = person;
    }

    @Override
    public void speak() {
        System.out.println("chinese");
        person.speak();
        System.out.println("english");

    }
}
