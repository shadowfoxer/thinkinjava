package main.chapter11;

import java.util.*;

/**
 * p220
 *
 * @author
 * @create 2019-04-17 上午12:26
 **/
public class AddingGroups {
    public static void main(String[] args){

        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Integer[] moreInts = {6,7,8,9,10};

        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection,11,12,13,14,15);

        Collections.addAll(collection,moreInts);

        List<Integer> list = Arrays.asList(16,17,18,19);
        list.set(1,100);

//        list.add(101);

        for (Integer i :
                list) {
            System.out.println(i);
        }

        System.out.println("=======================");

        for (Integer i:
             collection) {
            System.out.println(i);

        }

    }
}
