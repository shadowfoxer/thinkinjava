package main.chapter9;

/**
 * lowpass
 *
 * @author
 * @create 2019-04-13 上午2:43
 **/
public class LowPass extends Filter {

    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
