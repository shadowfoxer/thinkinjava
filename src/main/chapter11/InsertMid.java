package main.chapter11;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * p229 练习14
 *
 * @author
 * @create 2019-04-18 上午12:36
 **/
public class InsertMid {

    public static void main(String[] args){

        LinkedList<Integer> linkedList = new LinkedList<>();

        ListIterator<Integer> listIterator = linkedList.listIterator();

        boolean flag =false;

        for (int i=0;i<50;i++){

            listIterator.add(i);
            if (flag){
                listIterator.previous();
            }
            flag = !flag;

        }

        System.out.println(linkedList);

    }
}
