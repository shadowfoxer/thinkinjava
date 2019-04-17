package main.chapter9;

/**
 * bandpass
 *
 * @author
 * @create 2019-04-13 上午2:46
 **/
public class BandPass extends Filter {

    double lowCutoff,highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
