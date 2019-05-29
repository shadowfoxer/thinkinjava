package main.chapter11;

import java.util.Stack;

/**
 * p231练习15
 *
 * @author
 * @create 2019-04-18 上午1:11
 **/
public class StackTest {
    public static void main(String[] args){

        String params = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";

        char[] chars = params.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i =0;i<chars.length;i++){

            if (chars[i] == '-'){
                System.out.print(stack.pop());
            }else if(chars[i] == '+'){

                stack.push(chars[++i]);

            }



        }


    }
}
