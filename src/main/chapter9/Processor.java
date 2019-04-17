package main.chapter9;

/**
 * 基类
 *
 * @author
 * @create 2019-04-13 上午2:07
 **/
  class Processor {
    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return input;
    }
}
