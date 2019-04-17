package main.chapter5;

/**
 * 静态数据初始化
 *
 * @author
 * @create 2019-04-07 下午11:53
 **/
public class Bowl {


    public Bowl(int marker) {
        System.out.println("bowl(" + marker + ")");
    }
    void f1(int marker){
        System.out.println("f1(" + marker + ")");
    }

    void flex(Object... args){
        for (Object obj :
                args) {
            System.out.println(obj + " ");
        }
    }
}
