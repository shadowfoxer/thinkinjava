package main.chapter5;

/**
 * 5.3默认构造器，重载练习
 *
 * @author
 * @create 2019-04-07 下午8:38
 **/
public class Dog {

    String voice;

    int num;

    public Dog(){
        System.out.println("no name");
    }

    public Dog(String voice){this.voice = voice;}

    public Dog(int num){
        this("hello");
        this.num = num;
    }

    public Dog bark(){
        num++;
        System.out.println("please say " + voice + num +"times");

        return this;
    }

    public void bark(int num,String v){
        System.out.println("say" + v + num + "times");
    }

    public void bark(String v,int num){
        System.out.println("say" + v + num + "times");
    }

    public static void main(String[] args){

        //练习6，参数顺序颠倒是否起作用
        Dog dog = new Dog();
        dog.bark(2,"howling");
        dog.bark("barking",3);

        //使用this返回本对象
        Dog dog1 = new Dog("hi");
        dog1.bark().bark().bark().bark();
//        please say hi1times
//        please say hi2times
//        please say hi3times
//        please say hi4times

        //使用this调用另外一个构造函数
        Dog dog2 = new Dog(9);
        dog2.bark();//please say hello10times
    }
}
