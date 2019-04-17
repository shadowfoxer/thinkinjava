package main.chapter10;

/**
 * 外部类／内部类
 *
 * @author
 * @create 2019-04-13 下午7:16
 **/
public class Outer {

    class Inner{
        String i;

        Inner(String i) {
            this.i = i;
        }

        public void show(){
            System.out.println(i);
        }

    }

    public Inner in(String name){
        return new Inner(name);
    }


    public static void main(String[] args){
        Outer.Inner inner = new Outer().in("inner111");

        inner.show();
    }
}
