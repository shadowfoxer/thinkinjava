package main.DesignPattern.Single;

/**
 * 单例模式
 *
 * @author
 * @create 2019-04-17 上午11:18
 **/
public class SingleInstance {

    private SingleInstance(){
        System.out.println("construct");
    }

    private static class Single{


       final static SingleInstance instance = new SingleInstance();

    }

    public static SingleInstance getInstance(){
        return Single.instance;
    }


    public static void main(String[] args){
        SingleInstance ins1 = SingleInstance.getInstance();
        SingleInstance ins2 = SingleInstance.getInstance();

        System.out.println(ins1);
        System.out.println(ins2);
    }
}
