package main.chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * p433
 *
 * @author
 * @create 2019-05-21 上午12:00
 **/
public class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere" + id;
    }


    public static void main(String[] args){
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i=0;i<5;i++){
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);


        List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
        for (int i=0;i<5;i++){
            sphereList.add(new BerylliumSphere());
        }

        System.out.println(sphereList);
        System.out.println(sphereList.get(4));


        int[] ints = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(ints));
        System.out.println(ints[4]);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));

        integerList.add(97);
        System.out.println(integerList);
        System.out.println(integerList.get(4));

    }
}
