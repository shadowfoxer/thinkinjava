package main.chapter11;

import java.util.*;

/**
 * ex4,page223
 *
 * @author
 * @create 2019-04-17 上午12:46
 **/
public class GenerateCollection {


    public static String[] movies = new String[]{"11","42","33"};

    public static int index = 0;

    public static Collection next(Collection<String> collection){

        int trueIndex = index%movies.length;
        collection.add(movies[trueIndex]);
        index++;
        return collection;
    }


    public static void main(String[] args){
        for (int i =0;i<10;i++){

            System.out.println("ArrayList" + GenerateCollection.next(new ArrayList<String>()));
            System.out.println("LinkedList" + GenerateCollection.next(new LinkedList<String>()));
            System.out.println("HashSet" + GenerateCollection.next(new HashSet<String>()));
            System.out.println("LinkedHashSet" + GenerateCollection.next(new LinkedHashSet<String>()));
            System.out.println("TreeSet" + GenerateCollection.next(new TreeSet<String>()));
        }
    }
}
