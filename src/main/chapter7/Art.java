package main.chapter7;

/**
 * 父类
 *
 * @author
 * @create 2019-04-08 下午8:53
 **/
public class Art {
    public Art(String s) {
        System.out.println("art constructor");
    }

    public void f1(int i){
        System.out.println("father int" + i);
    }

    public void f1(float f){
        System.out.println("father float" + f);
    }
}
