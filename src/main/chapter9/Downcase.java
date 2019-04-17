package main.chapter9;

/**
 * child class
 *
 * @author
 * @create 2019-04-13 上午2:10
 **/
public class Downcase extends Processor {

    @Override
    Object process(Object input) {
        return ((String)input).toLowerCase();
    }
}
