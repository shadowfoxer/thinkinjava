package main.String;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * test java集合stream,lamdar使用
 *
 * @author
 * @create 2019-06-04 下午7:07
 **/
public class StreamTest {

    List<String> list = new ArrayList<>();

    private void initi(List<String> list){
        list.add("pig");
        list.add("dog");
        list.add("cat");
        list.add("tiger");
        list.add("duck");
        list.add("fog");
    }

    public void sayMethod1(String string){
        System.out.println("sayMethod1: " + string);
    }

    public void sayMethod2(String string){
        System.out.println("sayMethod2: " + string);
    }

    public void sayMethod3(String string){
        System.out.println("sayMethod3: " + string);
    }

    public void sayMethod4(String string){
        System.out.println("sayMethod4: " + string);
    }

    public String stringModify(String string){
        return null;
    }


    public static void main(String[] args){

        Predicate<String> myFilter = p -> p.startsWith("d");

        StreamTest streamTest = new StreamTest();
        streamTest.initi(streamTest.list);

        streamTest.list.forEach(streamTest::sayMethod1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        streamTest.list.forEach(a->streamTest.sayMethod2(a));

        streamTest.list.stream().forEach(streamTest::sayMethod3);

        streamTest.list.stream().filter(myFilter).forEach(a->streamTest.sayMethod4(a));

    }

}
