package main.chapter9;

/**
 * test class
 *
 * @author
 * @create 2019-04-13 上午2:13
 **/
public class Apply {

    public static void process(Processor p,Object s){
        System.out.println("using processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args){
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
