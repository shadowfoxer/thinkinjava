package main.chapter9;

/**
 * waveform
 *
 * @author
 * @create 2019-04-13 上午2:39
 **/
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Waveform" + id;
    }
}
