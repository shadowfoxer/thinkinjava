package main.chapter14;

/**
 * sweetshop
 *
 * @author
 * @create 2019-04-24 下午11:43
 **/


class Gum {
    static {
        System.out.println("loading gum");
    }
}


class Candy{
    static {
        System.out.println("loading candy");
    }
}

class Cookie{
    static {
        System.out.println("loading cookie");
    }
}

public class SweetShop {

    public static void main(String[] args){
        System.out.println("inside main");

        new Candy();

        System.out.println("after creating candy");

        try {
            Class.forName("main.chapter14.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("cannot find Gum");
        }

        System.out.println("after class.form(\"Gum\")");

        new Cookie();
        System.out.println("after creating cookie");
    }
}
