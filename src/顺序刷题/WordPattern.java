package 顺序刷题;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lincoln
 * @classname WordPattern
 * @description 类的描述
 * @params TODO
 * @return
 * @date 2020/12/16 15:59
 */
public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        wordPattern(pattern,s);
    }
    static boolean wordPattern(String pattern, String str) {
        Map<Character,String> ch2str = new HashMap<>();
        Map<String,Character> str2ch = new HashMap<>();
        String[] strList = str.split(" ");
        int m = strList.length;
        System.out.println("m="+m);
        int i=0;
        for(int j=0;j<pattern.length();j++){
            char ch = pattern.charAt(j);
            String temp = strList[i];
            System.out.println("temp="+temp);
            System.out.println("ch="+ch);
            if(str2ch.containsKey(temp) && str2ch.get(temp) !=ch){
                return false;
            }
            if(ch2str.containsKey(ch)&& ! temp.equals(ch2str.get(ch))){
                return false;
            }
            ch2str.put(ch,temp);
            str2ch.put(temp,ch);
            i=i+1;
        }
        System.out.println("i="+i);
        return i>m;
    }
}
