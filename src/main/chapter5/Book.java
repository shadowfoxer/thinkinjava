package main.chapter5;

/**
 * 5.5.3终结条件
 *
 * @author
 * @create 2019-04-07 下午9:14
 **/
public class Book {

    boolean ifCheckout = false;

    public Book(boolean ifCheckout) {
        this.ifCheckout = ifCheckout;
    }

    public Book() {
    }

    void checkIn(){
        ifCheckout = false;
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if(ifCheckout){
            System.out.println("error,no checkout");
        }
    }

    public static void main(String[] args){
        //从gc root能找到，不会gc
//        虚拟机栈中的引用对象
//        方法区中类静态属性引用的对象
//        方法区中常量引用对象
//        本地方法栈中JNI引用对象
        Book book = new Book(true);

        //找不到，会gc
        new Book(true);
        new Book(true);
        new Book(false);
        //执行soup
        System.gc();
    }
}
