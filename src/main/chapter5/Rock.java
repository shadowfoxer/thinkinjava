package main.chapter5;

/**
 * page77
 *
 * @author
 * @create 2019-04-07 下午7:39
 **/
public class Rock {

    private String name;
    private String str1 = "11111111";
    private String str2 = "22222222";
    private String str3 = str2;

    public Rock() {
        System.out.println("this is no params");
    }


    public Rock(String name){
        this.name = name;
        this.str2 = "new2222";
    }




    public static void main(String[] args){

//        构造方法快捷键：command+N
//        sout快捷键

        //question 1:创建一个类，它包含一个未初始化的String引用，验证该引用被Java初始化为null
        Rock A = new Rock();
        System.out.println(A.name);

        //question 2:创建一个类，它包含一个在定义时就被初始化的String域，以及另外一个通过构造器初始化的String域
//        这两种方式有何差异?
        Rock B = new Rock("test");


        System.out.println(B.str1);
        System.out.println(B.str2);
        System.out.println(B.str3);

        //输出结果为
//        11111111
//        new2222
//        22222222
//        .class文件如下
//        public class Rock {
//            private String name;
//            private String str1 = "11111111";
//            private String str2 = "22222222";
//            private String str3;
//
//            public Rock() {
//                this.str3 = this.str2;
//                System.out.println("this is no params");
//            }
//
//            public Rock(String var1) {
//                this.str3 = this.str2;
//                this.name = var1;
//                this.str2 = "new2222";
//            }
//
//            public static void main(String[] var0) {
//                Rock var1 = new Rock();
//                System.out.println(var1.name);
//                Rock var2 = new Rock("test");
//                System.out.println(var2.str1);
//                System.out.println(var2.str2);
//                System.out.println(var2.str3);
//            }
//        }
    }
}
