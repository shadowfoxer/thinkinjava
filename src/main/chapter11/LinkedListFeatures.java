package main.chapter11;

import java.util.LinkedList;
import java.util.List;

/**
 * p229
 *
 * @author
 * @create 2019-04-17 下午11:55
 **/
public class LinkedListFeatures {

    public static void main(String[] args){
        LinkedList<String> pets = new LinkedList<>();

        pets.add("dog");
        pets.add("cat");
        pets.add("toturies");
        pets.add("bird");
        pets.add("frog");

        System.out.println(pets);


        //返回头一个切不移除，为空跑出异常
        System.out.println("pets.getFirst: " + pets.getFirst());
        System.out.println("pets.element: " + pets.element());

        //返回头一个且不移除，为空返回null
        System.out.println("pets.peek: " + pets.peek());

        //返回头一个且移除，为空抛异常
        System.out.println("pets.remove: " + pets.remove());
        System.out.println("pets.removeAll: " + pets.removeFirst());
        System.out.println(pets);

        //返回头一个且移除，唯恐返回null
        System.out.println("pets.poll: " + pets.poll() );
        System.out.println(pets);

        pets.addFirst("rabbit");
        //尾插
        pets.add("snake");
        pets.addLast("bear");
        System.out.println(pets);

        System.out.println("pets.removeLast: " + pets.removeLast());
        System.out.println(pets);
    }
}
