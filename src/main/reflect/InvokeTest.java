package main.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试invoke方法
 *
 * @author
 * @create 2019-07-09 下午2:09
 **/
public class InvokeTest {

    private void say(String sth){
        System.out.println(sth);
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = InvokeTest.class.getDeclaredMethod("say", String.class);
        InvokeTest invokeTest =new InvokeTest();
        method.invoke(invokeTest,"I say invoke");
    }
}
