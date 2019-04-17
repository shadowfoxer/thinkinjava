package main.chapter5;

/**
 * 静态数据初始化
 *
 * @author
 * @create 2019-04-08 上午12:02
 **/
public class StaticInitialization {

    public static void main(String[] args){
//        System.out.println("crateing new cupboard() in main");
//        new Cupboard();
//        System.out.println("creating new cupboard() in main agine");
//        new Cupboard();
//        table.f2(1);
//        cupboard.f3(1);




        //练习16-18，page101
        String[] strings = {"1","2","3","4"};
        for (String s :
                strings) {
            System.out.println(s);

        }

        String[] strings1 = new String[]{"4","3","2","1"};
        for (String s :
                strings1) {
            System.out.println(s);
        }

        //只有引用，未执行构造函数
        Bowl[] bowls = new Bowl[4];
        for (Bowl bowl :
                bowls) {
            System.out.println(bowl);
            //初始化为null
//            null
//            null
//            null
//            null
        }

        Bowl bowl = new Bowl(123);
        bowl.flex(1,2,3,4,5,6);
        bowl.flex("a","b","c","d");
        bowl.flex();
//        Bowl[] bowls1 = new Bowl[]{new Bowl(1),new Bowl(2),new Bowl(3),new Bowl(4)};

    }

//    static Table table = new Table();
//    static Cupboard cupboard = new Cupboard();
}

/**
 * bowl(1)
 * bowl(2)
 * table()
 * f1(1):bowl1(2)
 * bowl4
 * bowl5
 * bowl3
 * cuboard()
 * f1(1)
 * creating...
 * bowl3
 * cuboard()
 * f1(2)
 * creating...
 * bowl3
 * cuboard()
 * f1(2)
 * f2(1)
 * f3(1)
 */
