package main.chapter14;

/**
 * toytest
 *
 * @author
 * @create 2019-04-25 上午12:00
 **/


interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    public Toy() {
    }
    public Toy(int i){

    }
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
    FancyToy(){
        super(1);
    }
}


public class ToyTest {

    static void printInfo(Class cc){
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface()
        + "]");

        System.out.println("Simple name: " + cc.getSimpleName());

        System.out.println("canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args){
        Class c = null;

        try {
            c = Class.forName("main.chapter14.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("can not find fancytoy");
            System.exit(1);
        }


        printInfo(c);

        for (Class face :
                c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();

        Object obj = null;

        try {
            obj = up.newInstance();
        }catch (InstantiationException e){
            System.out.println("can not instantiate");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("can not access");
            System.exit(1);
        }

        printInfo(obj.getClass());

    }
}

