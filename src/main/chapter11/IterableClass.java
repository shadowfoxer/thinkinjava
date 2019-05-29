package main.chapter11;

import java.util.Iterator;

/**
 * p241
 *
 * @author
 * @create 2019-04-19 上午1:52
 **/
public class IterableClass implements Iterable<String> {

    protected String[] words = new String[]{"1","23","456","789"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args){
        for (String s :
                new IterableClass()) {
            System.out.println(s);
        }
    }
}
