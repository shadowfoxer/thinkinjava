package main.chapter11;

import java.util.*;

/**
 * p219
 *
 * @author
 * @create 2019-04-17 上午12:09
 **/
public class SimpleCollection {
    public static void main(String[] args){
        Collection<Integer> c = new ArrayList<Integer>();
        Collection<Integer> b = new HashSet<>();

        for (int i=0;i<10;i++){
            b.add(i);
            b.add(i);
        }


        System.out.println(b.size());

        for (Integer s :
                b) {
            System.out.println(s);
        }

    }
}
