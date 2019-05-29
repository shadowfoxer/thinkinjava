package main.chapter16;

import java.util.Arrays;

/**
 * p436
 *
 * @author
 * @create 2019-05-21 上午12:22
 **/
public class IceCream {

    static final  String[] flowars = {
            "1","2","3","4","5"
    };

    public static String[] getFlowars(int n){
        String[] results = new String[n];

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0;i<flowars.length;i++){
            results[i] = stringBuilder.append(flowars[i]).toString();
        }
        return results;
    }

    public static void main(String[] args){
        String[] result = IceCream.getFlowars(18);
        System.out.println(Arrays.toString(result));
    }
}
