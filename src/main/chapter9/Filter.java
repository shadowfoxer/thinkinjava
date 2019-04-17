package main.chapter9;

/**
 * filter
 *
 * @author
 * @create 2019-04-13 上午2:41
 **/
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input){
        return input;
    }
}
