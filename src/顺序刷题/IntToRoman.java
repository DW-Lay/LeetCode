package 顺序刷题;

/**
 * @classname IntToRoman
 * @description：整数转罗马数字
 * @author：dml
 * @date 2020/11/16 8:51
 * @version: 1.0
 */
public class IntToRoman {
    public String Int2Roman(int num){
        StringBuilder ret  = new StringBuilder();
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for(int i=0; i<values.length && num>0;i++){
            while(num>=values[i]){
                num -= values[i];
                ret.append(symbols[i]);
            }
        }
        return ret.toString();

    }
}
