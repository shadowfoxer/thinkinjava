package main.String;

import java.util.HashMap;
import java.util.Map;

/**
 * 各种类型转换
 *
 * @author
 * @create 2019-05-30 上午12:38
 **/
public class TransUtil {

    public static void main(String[] args){

        /**
         * 字符串转字符
         */
        String string = "abcdefghijklmnn";
        char[] chars = string.toCharArray();
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }

        /**
         *  注意装箱操作
         */

        Map<Character,Character> map = new HashMap<>();
        map.put('a','a');
        System.out.println(map.containsKey('a'));



    }
}
