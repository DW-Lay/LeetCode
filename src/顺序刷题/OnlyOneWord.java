package 顺序刷题;

import java.util.HashMap;

/**
 * @author Lincoln
 * @classname OnlyOneWord
 * @description 类的描述
 * @params TODO
 * @return
 * @date 2020/12/23 11:20
 */
public class OnlyOneWord {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int length = s.length();
        for(int i=0;i<length;i++){
            char ch = s.charAt(i);
            if(! map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for(int i=0;i<length;i++){
            char ch = s.charAt(i);
            int index = map.get(ch);
            System.out.println("ch="+ch+",index="+index);
            if(index ==1){
                return i;
            }
        }
        return -1;
    }
}
