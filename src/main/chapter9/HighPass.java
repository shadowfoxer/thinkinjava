package main.chapter9;

/**
 * highpass
 *
 * @author
 * @create 2019-04-13 上午2:44
 **/
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
