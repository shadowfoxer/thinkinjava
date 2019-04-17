package main.chapter11;

import java.util.*;

/**
 * p223
 *
 * @author
 * @create 2019-04-17 上午1:27
 **/
public class ListFeatures {

    public static void main(String[] args){
        List<String> pets = new ArrayList<>();

        pets.add("dog");
        pets.add("cat");
        pets.add("fish");
        pets.add("duck");
        pets.add("bear");


        System.out.println("2" + pets);

        pets.remove("dog");

        System.out.println("3" + pets);

        pets.add(2,"dragon");
        System.out.println("4" + pets);

        List<String> sub = pets.subList(2,5);
        System.out.println("5" + sub);

        Collections.sort(sub);
        System.out.println("6" + sub);

        Collections.shuffle(sub,new Random(33));
        System.out.println("7" + sub);

        List<String> copy = new ArrayList<>(pets);
        sub = Arrays.asList(sub.get(1),sub.get(2));
        System.out.println("8" + sub);

        //交集
        copy.retainAll(sub);
        System.out.println("9" + copy);

        copy = new ArrayList<>(pets);
        copy.removeAll(sub);
        System.out.println("10" + copy);

        copy.addAll(2,sub);
        System.out.println("11" + copy);

        Object[] s = copy.toArray();
        System.out.println("12" + s[0]);

        String[] ss = copy.toArray(new String[0]);
        System.out.println("13" + ss[0]);

    }
}
