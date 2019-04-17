package main.chapter11;

import java.util.*;

/**
 * reverse
 *
 * @author
 * @create 2019-04-14 上午12:36
 **/
public class IntegerReverse {


    public static void reverse(List<Integer>list1 ,List<Integer> list2){


        int size = list1.size();
        ListIterator<Integer> iterator1 = list1.listIterator(size);

        while (iterator1.hasPrevious()){
            list2.add(iterator1.previous());
        }

        for (Integer e:list2
             ) {
            System.out.println(e);
        }

        for (Integer e:list1){
            System.out.println(e);
        }
    }


    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list1.add(i);
        }

        IntegerReverse.reverse(list1,new ArrayList<Integer>());

    }



}
