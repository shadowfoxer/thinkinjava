package main.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * PeopleInvocationHandler
 *
 * @author
 * @create 2019-07-09 下午2:44
 **/
public class PeopleInvocationHandler implements InvocationHandler {

    private Object people;


    public PeopleInvocationHandler(Object people) {
        this.people = people;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(people,args);
        System.out.println("---------end---------");
        return invoke;
    }

    public static void main(String[] args){
        People chinese = new Chinese();
        PeopleInvocationHandler peopleInvocationHandler = new PeopleInvocationHandler(chinese);
        People proxy = (People) Proxy.newProxyInstance(chinese.getClass().getClassLoader(),chinese.getClass().getInterfaces(),peopleInvocationHandler);

        proxy.sayHello();
    }
}
