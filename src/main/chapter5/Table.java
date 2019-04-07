package main.chapter5;

/**
 * 静态数据初始化
 *
 * @author
 * @create 2019-04-07 下午11:56
 **/
public class Table {

    static Bowl bowl1 = new Bowl(1);

    Bowl bowl11;
    Bowl bowl12;
    {
        bowl11 = new Bowl(11);
        bowl12 = new Bowl(12);
        System.out.println("11 and 12");
    }

    public Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}