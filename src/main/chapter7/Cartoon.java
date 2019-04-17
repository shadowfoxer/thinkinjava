package main.chapter7;

/**
 * extends drawing
 *
 * @author
 * @create 2019-04-08 下午8:54
 **/
public class Cartoon extends Drawing{
    public Cartoon() {
        System.out.println("drawing constructor");
    }

    public void f1(char c){
        System.out.println("child char" + c);
    }

    public void f1(int i){
//        super.f1(i);
        System.out.println("child int" + i);
    }

    public static void main(String[] args){
        Art cartoon = new Cartoon();
        cartoon.f1('a');
        cartoon.f1(1);
        cartoon.f1(2f);

        Cartoon cartoon1 = new Cartoon();
        cartoon1.f1('a');
        cartoon1.f1(1);
        cartoon1.f1(2f);

    }
}
