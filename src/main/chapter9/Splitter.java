package main.chapter9;

import java.util.Arrays;

/**
 * child class
 *
 * @author
 * @create 2019-04-13 上午2:11
 **/
public class Splitter extends Processor {

    @Override
    Object process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
